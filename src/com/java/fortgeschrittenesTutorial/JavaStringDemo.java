package com.java.fortgeschrittenesTutorial;

import java.util.StringTokenizer;

public class JavaStringDemo {
    public static void main(String[] args) {
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
