package com.java.pro;

public class Variable {
    static int allClicks=0;
    String str="Hello World!";
    public void method(){
        int i=0;
    }
    public void gouAge(){
        int age=2;
        age+=1;
        System.out.println("小狗郭金龙的年龄是："+age);
    }

    public static void main(String[] args) {
        Variable v= new Variable();
        v.gouAge();
    }
}
