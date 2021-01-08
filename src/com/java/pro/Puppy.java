package com.java.pro;

public class Puppy {
    public Puppy() {

    }
    public Puppy(String name) {
        System.out.println("小狗的名字是："+name);
    }

    public static void main(String[] args) {
        Puppy p = new Puppy("郭金龙");
    }
}
