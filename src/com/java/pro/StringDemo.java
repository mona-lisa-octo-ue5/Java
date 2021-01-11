package com.java.pro;

public class StringDemo {
    public static void main(String[] args) {
        char[] helloArray={'r','u','n','o','e','b'};
        String helloString=new String(helloArray);
        System.out.println(helloString);

        String site = "www.runoob.com";
        int len = site.length();
        System.out.println( "菜鸟教程网址长度 : " + len );



    }
}
