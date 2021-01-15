package com.java.fortgeschrittenesTutorial;

import javax.net.ssl.SSLSession;
import java.util.Properties;
import java.util.Set;

public class JavaEmailDemo {
    public static void main(String[] args) {

    }

    public static void sendEmail(){
        String to="iosshiyulong@yeah.net";
        String from="644929132@qq.com";
        String host="localhost";
        SSLSession session=SSLSession.

    }

    public static void sendHTMLEmail(){
        String to="abc@gmail.com";
        String from="web@gmail.com";
        String host="localhost";
        Properties properties= System.getProperties();
        properties.setProperty("mail.smtp.host",host);
        SSLSession
    }
}
