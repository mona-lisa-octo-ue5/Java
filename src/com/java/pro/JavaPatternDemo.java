package com.java.pro;

import java.lang.reflect.Parameter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaPatternDemo {
    public static void method1(){
        String content="I am noob "+"from runoob.com.";
        String pattern=".*runoob.*";
        boolean isMatch= Pattern.matches(pattern,content);
        System.out.println("字符串中是否包含了'runoob'子字符串？"+isMatch);
    }
    public static void method2(){
        String line ="This order was placed for QT3000! OK?";
        String pattern="(\\D*)(\\d*)(.*)";
        Pattern r= Pattern.compile(pattern);
        Matcher m=r.matcher(line);
        if (m.find()){
            System.out.println("Found value:"+m.group(0));
            System.out.println("Found value:"+m.group(1));
            System.out.println("Found value:"+m.group(2));
            System.out.println("Found value:"+m.group(3));
        }else {
            System.out.println("NO MATCH");
        }
    }
    public static void main(String[] args) {
        method1();
        method2();
    }
}
