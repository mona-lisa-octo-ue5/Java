package com.java.fortgeschrittenesTutorial;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws Exception {
        URL u = new URL("https://www.runoob.com/java/java-examples.html");
        URLConnection uc = u.openConnection();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        System.out.println("test.html 文件最后修改时间 :" + ft.format(new Date(timestamp)));
    }
}
