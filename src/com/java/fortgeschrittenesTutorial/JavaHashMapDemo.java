package com.java.fortgeschrittenesTutorial;

import java.security.PublicKey;
import java.util.HashMap;

public class JavaHashMapDemo {
    public static void main(String[] args) {
        add();
        addString();
    }
    public static void addString(){
        HashMap<String,String> sites=new HashMap<String,String>();
        sites.put("one","Google");
        sites.put("two","Runoob");
        sites.put("three","Taobao");
        System.out.println(sites);
        System.out.println(sites.size());
        for (String i:sites.keySet()){
            System.out.println("key: "+i+" value: "+sites.get(i));
        }
        for (String value: sites.values()){
            System.out.println(value+", ");
        }
    }
    public static void add(){
        HashMap<Integer,String> sites = new HashMap<Integer,String>();
        sites.put(1,"Google");
        sites.put(2,"Runoob");
        sites.put(3,"Taobao");
        sites.put(4,"Zhihu");
        sites.put(4,"JueJing");
        System.out.println(sites);
        System.out.println(sites.get(3));
        sites.remove(4);
        System.out.println(sites);
        sites.clear();
        System.out.println(sites);
    }


}
