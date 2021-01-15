package com.java.fortgeschrittenesTutorial;

public class JavaStringDemo {
    public static void main(String[] args) {
        m7();
        m6();
        m5();
        m4();
        String str="this is Java";
        System.out.println(removeCharAt(str,3));
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
