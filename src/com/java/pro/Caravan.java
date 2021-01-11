package com.java.pro;

public class Caravan {
    private double prioce;
    private String model;
    private String year;

    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=25;
        int d=25;
        int e=++a;
        int f=--b;
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("b/a="+(b/a));
        System.out.println("b%a="+(b%a));
        System.out.println("c%a="+(c%a));
        System.out.println("a++ ="+(a++));
        System.out.println("a-- ="+(a--));
        System.out.println("d++ ="+(d++));
        System.out.println("++d ="+(++d));
        System.out.println("进行自增运算后的值等于"+e);
        System.out.println("进行自减运算后的值等于"+f);
        System.out.println("a==b ="+(a==b));
        System.out.println("a!=b ="+(a!=b));
        System.out.println("a>b ="+(a>b));
        System.out.println("a<b ="+(a<b));
        System.out.println("b>=a ="+(b>=a));
        System.out.println("b<=a ="+(b<=a));

        int aa=60;
        int bb=13;
        int cc=0;
        cc=aa & bb;
        System.out.println("aa&bb="+cc);
        cc=aa | bb;
        System.out.println("aa|bb="+cc);
        cc=aa^bb;
        System.out.println("aa^bb="+cc);
        cc=~aa;
        System.out.println("~aa="+cc);
        cc=aa<<2;
        System.out.println("aa<<2="+cc);
        cc=aa>>2;
        System.out.println("aa>>2="+cc);
        cc=aa>>>2;
        System.out.println("aa>>>2="+cc);

        boolean dd=true;
        boolean ee=false;
        System.out.println("dd&&ee="+(dd&&ee));
        System.out.println("dd||ee="+(dd||ee));
        System.out.println("!(dd&&ee)="+!(dd&&ee));

    }
}
