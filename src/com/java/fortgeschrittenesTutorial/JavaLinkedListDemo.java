package com.java.fortgeschrittenesTutorial;

import java.util.LinkedList;

public class JavaLinkedListDemo {
    public static void main(String[] args) {
        add();

    }

    public static void add(){
        LinkedList<String> sites=new LinkedList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        System.out.println();
        sites.addFirst("Wiki");
        System.out.println(sites);
    }
}
