package com.java.fortgeschrittenesTutorial;

import java.util.HashSet;

public class JavaHashSetDemo {
    public static void main(String[] args) {
        add();
    }

    public static void add(){
        HashSet<String> sites=new HashSet<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Tapbao");
        sites.add("Zhihu");
        sites.add("Runoob");
        System.out.println(sites);
    }
}
