package com.java.pro;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(10);
        sb.append("Runoob,");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(8,"Java");
        System.out.println(sb);
        sb.delete(5,8);
        System.out.println(sb);

        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
    }
}
