package com.ls.aip.http;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LSAipHttpClient {
    public LSAipHttpClient(){

    }

    public static LSAipResponse post(LSAipRequest request) {
        String charset=request.getContentEncoding();
        String content=request.getBodyStr();
        HashMap<String,String> header=request.getHeaders();
        LSAipResponse response=new LSAipResponse();
        DataOutputStream out=null;
        InputStream is=null;
        LSAipResponse var40;
        try{
            String url;
            if (request.getParams().isEmpty()){
                url=request.getUri().toString();
            }else {
                url=String.format("%s?%s",request.getUri().toString(), request.getParamStr());
            }
            URL console=new URL(url);
//            Proxy proxy=request.getConfig()==null ? Proxy.NO_PROXY : request.getConfig().getProxy();
            Proxy proxy=Proxy.NO_PROXY;
            HttpURLConnection conn=(HttpURLConnection) console.openConnection(proxy);
            if (request.getConfig() !=null){
                conn.setConnectTimeout(request.getConfig().getConnectionTimeoutMillis());
                conn.setReadTimeout(request.getConfig().getSocketTimeoutMills());
            }
            conn.setDoOutput(true);
            Iterator var11=header.entrySet().iterator();
            while (var11.hasNext()){
                Map.Entry<String, String> entry=(Map.Entry<String, String>) var11.next();
                conn.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            conn.connect();
            out=new DataOutputStream(conn.getOutputStream());
            out.write(content.getBytes(charset));
            out.flush();
            int statusCode = conn.getResponseCode();
            response.setHeader(conn.getHeaderFields());
            response.setStatus(statusCode);
            response.setCharset(charset);
            if (statusCode == 200){
                is=conn.getInputStream();
                if (is != null){
                    ByteArrayOutputStream outStream = new ByteArrayOutputStream();
                    byte[] buffer=new byte[1024];
                    boolean var14 = false;
                    int len;
                    while ((len = is.read(buffer)) != -1) {
                        outStream.write(buffer,0,len);
                    }
                    response.setBody(outStream.toByteArray());
                }
                var40 = response;
                return var40;
            }
            var40 = response;
        }catch (MalformedURLException var35){
            var35.printStackTrace();
            return response;
        }catch (UnsupportedEncodingException var36){
            var36.printStackTrace();
            return response;
        }catch (IOException var37){
            var37.printStackTrace();
            return response;
        }finally {
            if (out != null){
                try{
                    out.close();
                }catch (IOException var34){
                    var34.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                }catch (IOException var33){
                    var33.printStackTrace();
                }
            }
        }
        return var40;
    }
}
