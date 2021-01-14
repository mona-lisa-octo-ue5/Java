package com.java.fortgeschrittenesTutorial;

import java.util.HashSet;

public class JavaHashSetDemo {
    public static void main(String[] args) {
        add();
        add2();
    }
    public static void add2(){
        HashSet<String> sites=new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");
        System.out.println(sites);
        System.out.println(sites.size());
        for (String i: sites){
            System.out.println(i);
        }
        

    }
    public static void add(){
        HashSet<String> sites=new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        sites.add("Runoob");
        System.out.println(sites);
        System.out.println(sites.contains("Taobao"));
        sites.remove("Taobao");
        System.out.println(sites);
        sites.clear();
        System.out.println(sites);
    }
}
