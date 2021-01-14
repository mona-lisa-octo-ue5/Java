package com.java.fortgeschrittenesTutorial;

import com.java.obj.A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class JavaArrayListDemo {
    public static void main(String[] args) {
        other();
        add();
    }
    public static void other(){
        ArrayList<Integer> myNumbers=new ArrayList<Integer>();
        myNumbers.add(10);
        myNumbers.add(55);
        myNumbers.add(20);
        myNumbers.add(25);
        for (int i: myNumbers){
            System.out.println(i);
        }
        System.out.println();
        Collections.sort(myNumbers);
        for (int i:myNumbers){
            System.out.println(i);
        }
    }
    public static void add(){
        ArrayList<String> sites=new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Weibo");
        System.out.println(sites);
        System.out.println(sites.get(1));
        sites.set(2,"Wiki");
        System.out.println(sites);
        sites.remove(3);
        System.out.println(sites);
        System.out.println(sites.size());
        for (int i=0;i<sites.size();i++){
            System.out.println(sites.get(i));
        }
        for (String i: sites){
            System.out.println(i);
        }
        System.out.println();
        Collections.sort(sites);
        for (String i:sites){
            System.out.println(i);
        }
    }
}
