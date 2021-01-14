package com.java.fortgeschrittenesTutorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

public class JavaTCPDemo {
    public static void main(String[] args) {
        urlConn();
        System.out.println();
        url();
    }

    public static void urlConn(){
        try{
            URL url=new URL("http://www.runoob.com");
            URLConnection urlConnection=url.openConnection();
            HttpURLConnection connection=null;
            if (urlConnection instanceof HttpURLConnection){
                connection=(HttpURLConnection) urlConnection;
            }else {
                System.out.println("请输入URL地址");
                return;
            }
            BufferedReader in=new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String urlString="";
            String current;
            while ((current=in.readLine()) !=null){
                urlString += current;
            }
            System.out.println(urlString);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void url(){
        try {
            URL url=new URL("http://www.runoob.com/index.html?language=cn#j2se");
            System.out.println("URL 为："+url.toString());
            System.out.println("协议为："+url.getProtocol());
            System.out.println("验证信息为："+url.getAuthority());
            System.out.println("文件名及请求参数："+url.getFile());
            System.out.println("主机名："+url.getHost());
            System.out.println("路径："+url.getPath());
            System.out.println("端口："+url.getPort());
            System.out.println("默认端口："+url.getDefaultPort());
            System.out.println("请求参数："+url.getQuery());
            System.out.println("定位位置："+url.getRef());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
