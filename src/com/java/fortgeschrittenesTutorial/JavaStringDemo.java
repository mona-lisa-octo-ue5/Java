package com.java.fortgeschrittenesTutorial;

import java.util.StringTokenizer;

public class JavaStringDemo {
    public static void main(String[] args) {
        m15();
        m12();
        m10();
        m9();
        m8();
        m7();
        m6();
        m5();
        m4();
        String str="this is Java";
        System.out.println(removeCharAt(str,3));
    }

    public static void m15() {
        String variables[] = new String[50000];
        for (int i = 0; i < 50000; i++) {
            variables[i] = "s" + i;
        }
        long startTime0 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            variables[i] = "hello";
        }
        long endTime0 = System.currentTimeMillis();
        System.out.println("直接使用字符串：" + (endTime0-startTime0) + " ms" );
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            variables[i] = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("使用 new 关键词：" + (endTime1 - startTime1) + " ms");
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            variables[i] = new String("hello");
            variables[i] = variables[i].intern();
        }
        long endTime2 = System.currentTimeMillis();
        System.out.println("使用字符串对象的 intern() 方法：" + (endTime2 - startTime2) + " ms");
    }
    public static void m12() {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s1 = "hello";
            String s2 = "hello";
        }
        long endTime = System.currentTimeMillis();
        System.out.println("通过 String 关键词创建字符串" + " : " + (endTime - startTime) + " 毫秒" );
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 50000; i++) {
            String s3 = new String("hello");
            String s4 = new String("hello");
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("通过 String 对象创建字符串" + " : " + (endTime1 - startTime1) + " 毫秒");
    }
    public static void m11() {
        String first_str = "Welcome to Microsoft";
        String second_str = "I work with microsoft";
//        boolean match1 = first_str;
//        regionMatches(11, second_str, 12, 9);
//        boolean match2 = first_str;

    }
    public static void m10() {
        String str = "string runoob";
        String strUpper = str.toUpperCase();
        System.out.println("原始字符串： "+str);
        System.out.println("转换为大写： "+strUpper);
    }
    public static void m9(){
        String str = "This is String , split by StringTokenizer, created by runoob";
        StringTokenizer st = new StringTokenizer(str);
        System.out.println("----- 通过空格分隔 -----");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
        System.out.println("----- 通过逗号分隔 -----");
        StringTokenizer st2 = new StringTokenizer(str, ",");
        while (st2.hasMoreElements()) {
            System.out.println(st2.nextElement());
        }
    }
    public static void m8(){
        String str = "www-runoob-com";
        String[] temp;
        String delimeter = "_";
        temp = str.split(delimeter);
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
            System.out.println("");
        }
        System.out.println("----java for each循环输出的方法------");
        String str1 = "www.runoob.com";
        String[] temp1;
        String delimeter1 = "\\.";
        temp1 = str1.split(delimeter1);
        for (String x : temp1) {
            System.out.println(x);
            System.out.println("");
        }
    }
    public static void m7(){
        String strOrig="Google Runoob Taobao";
        int intIndex = strOrig.indexOf("Runoob");
        if (intIndex == -1){
            System.out.println("没有找到字符串 Runoob");
        }else {
            System.out.println("Runoob 字符串位置 "+intIndex);
        }
    }
    public static void m6(){
        String s="runoob";
        String reverse=new StringBuffer(s).reverse().toString();
        System.out.println("字符串反转前："+s);
        System.out.println("字符串反转后："+reverse);
    }
    public static void m5(){
        String str="Hello World";
        System.out.println(str.replace('H','W'));
        System.out.println(str.replaceFirst("He","Wa"));
        System.out.println(str.replaceAll("He","Ha"));
    }
    public static String removeCharAt(String s,int pos){
        return s.substring(0,pos)+s.substring(pos+1);
    }
    public static void m4(){
        String s="Hello world ,Hello Runoob";
        int l=s.lastIndexOf("Runoob");
        if (l==-1){
            System.out.println("没有找到字符串 Runoob");
        }else {
            System.out.println("Runoob 字符串最后出现的位置： "+l);
        }
    }
}
