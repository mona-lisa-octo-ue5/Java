package com.ls.aip.http;

import com.ls.aip.util.LSAipClientConfiguration;
import com.ls.aip.util.LSUtil;
import jdk.jshell.execution.Util;
import org.json.JSONObject;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LSAipRequest {
    private HashMap<String, String> headers;
    private HashMap<String, String> params;
    private HashMap<String, Object> body;
    private URI uri;
    private LSHttpMethodName httpMethod;
    private LSEBodyFormat bodyFormat;
    private String contentEncoding;
    private LSAipClientConfiguration config;

    public LSAipRequest() {
        this.headers = new HashMap();
        this.params = new HashMap();
        this.body = new HashMap();
        this.httpMethod = LSHttpMethodName.POST;
        this.bodyFormat = LSEBodyFormat.FORM_KV;
        this.contentEncoding = "UTF8";
        this.config = null;
    }

    public LSAipRequest(HashMap<String, String> header, HashMap<String, String> bodyParams) {
        this.headers = header;
        this.params = bodyParams;
    }

    public String getContentEncoding() {
        return this.contentEncoding;
    }

    public void setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
    }

    public LSEBodyFormat getBodyFormat() {
        return this.bodyFormat;
    }

    public void setBodyFormat(LSEBodyFormat bodyFormat) {
        this.bodyFormat = bodyFormat;
    }

    public void addHeader(String key, String value) {
        this.headers.put(key, value);
        if (key.equals("Content-Encoding")) {
            this.contentEncoding = value;
        }
    }

    public void addParam(String key, String value) {
        this.params.put(key, value);
    }

    public void addBody(String key, Object value) {
        this.body.put(key, value);
    }

    public void addBody(HashMap other) {
        if (other != null) {
            this.body.putAll(other);
        }
    }

    public HashMap<String, String> getParams() {
        return this.params;
    }

    public String getBodyStr() {
        ArrayList<String> arr = new ArrayList();
        if (this.bodyFormat.equals(LSEBodyFormat.FORM_KV)) {
            Iterator var5 = this.body.entrySet().iterator();
            while (true) {
                while (var5.hasNext()) {
                    Map.Entry<String, Object> entry = (Map.Entry<String, Object>) var5.next();
                    if (entry.getValue() != null && !entry.getValue().equals("")) {
                        arr.add(String.format("%s=%s", LSUtil.uriEncode((String) entry.getKey(), true),LSUtil.uriEncode(entry.getValue().toString(), true)));
                    }else {
                        arr.add(LSUtil.uriEncode((String) entry.getKey(), true));
                    }
                }
                return LSUtil.mkString(arr.iterator(), '&');
            }
        }else if (!this.bodyFormat.equals(LSEBodyFormat.RAW_JSON)) {
            return this.bodyFormat.equals(LSEBodyFormat.RAW_JSON_ARRAY) ? (String) this.body.get("body") : "";
        }else {
            JSONObject json=new JSONObject();
            Iterator var3=this.body.entrySet().iterator();
            while (var3.hasNext()){
                Map.Entry<String, Object> entry=(Map.Entry<String, Object>) var3.next();
                json.put((String) entry.getKey(), entry.getValue());
            }
            return json.toString();
        }
    }

    public String getParamStr() {
        StringBuffer buffer=new StringBuffer();
        Iterator var2=this.params.entrySet().iterator();
        while (var2.hasNext()){
            Map.Entry<String, String> entry=(Map.Entry<String, String>) var2.next();
            buffer.append(String.format("%s=%s&", entry.getKey(), entry.getValue()));
        }
        if (buffer.length()>0){
            buffer.deleteCharAt(buffer.length()-1);
        }
        return buffer.toString();
    }

    public HashMap<String, Object> getBody() {
        return this.body;
    }

    public void setBody(HashMap<String, Object> body) {
        this.body = body;
    }

    public void setParams(HashMap<String, String> params) {
        this.params = params;
    }

    public HashMap<String, String> getHeaders() {
        return this.headers;
    }

    public void setHeaders(HashMap<String, String> headers) {
        this.headers = headers;
    }

    public URI getUri() {
        return this.uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }
    public void setUri(String uri) {
        try {
            this.uri=new URI(uri);
        }catch (URISyntaxException var3) {
            var3.printStackTrace();
        }
    }

    public LSHttpMethodName getHttpMethod() {
        return this.httpMethod;
    }

    public void setHttpMethod(LSHttpMethodName httpMethod) {
        this.httpMethod = httpMethod;
    }

    public LSAipClientConfiguration getConfig() {
        return this.config;
    }

    public void setConfig(LSAipClientConfiguration config) {
        this.config = config;
    }
}
