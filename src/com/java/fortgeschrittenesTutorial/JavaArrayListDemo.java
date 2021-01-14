package com.java.fortgeschrittenesTutorial;

import com.java.obj.A;

import java.util.ArrayList;

public class JavaArrayListDemo {
    public static void main(String[] args) {
        add();
    }

    public static void add(){
        ArrayList<String> sites=new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        System.out.println(sites.get(1));
    }
}
