package com.java.fortgeschrittenesTutorial;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main extends Thread {
    public static void main(String[] args) throws Exception {
        URL u = new URL("https://www.runoob.com/java/java-examples.html");
        URLConnection uc = u.openConnection();
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
        uc.setUseCaches(false);
        long timestamp = uc.getLastModified();
        System.out.println("test.html 文件最后修改时间 :" + ft.format(new Date(timestamp)));

        Main tt=new Main();
        tt.setName("Thread");
        System.out.println("before start() ");


    }

    public void run() {
        for (int i=0;i<10;i++){
            printMsg();
        }
    }

    public void printMsg(){
        Thread t=Thread.currentThread();
        String name=t.getName();
        System.out.println("name="+name);
    }
}
