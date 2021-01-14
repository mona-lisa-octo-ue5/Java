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
        System.out.println();
        sites.addLast("Book");
        System.out.println(sites);
        System.out.println();
        sites.removeFirst();
        System.out.println(sites);
        System.out.println();
        sites.removeLast();
        System.out.println(sites);
        System.out.println(sites.getFirst());
        System.out.println(sites.getLast());
        System.out.println();
        for (int size=sites.size(),i=0;i<size;i++){
            System.out.println(sites.get(i));
        }
        System.out.println();
        for (String i:sites){
            System.out.println(i);
        }
        System.out.println();

    }
}
