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
    private static final String REGEX="\\bcat\\b";
    private static final String INPUT="cat cat cat cattie cat";
    public static void method3(){
        Pattern p=Pattern.compile(REGEX);
        Matcher m=p.matcher(INPUT);
        int count=0;
        while (m.find()){
            count++;
            System.out.println("Match number "+count);
            System.out.println("start():"+m.start());
            System.out.println("end():"+m.end());
        }
    }
    private static final String REGEX2="foo";
    private static final String INPUT2="fooooooooooooooooo";
    private static final String INPUT3="ooooofoooooooooooo";
    private static Pattern pattern;
    private static Matcher matcher;
    private static Matcher matcher2;
    public static void method4(){
        pattern=pattern.compile(REGEX2);
        matcher=pattern.matcher(INPUT2);
        matcher2=pattern.matcher(INPUT3);
        System.out.println("Current REGEX2 is:"+REGEX2);
        System.out.println("Current INPUT2 is:"+INPUT2);
        System.out.println("Current INPUT3 is:"+INPUT3);
        System.out.println("lookingAt():"+matcher.lookingAt());
        System.out.println("matches():"+matcher.matches());
        System.out.println("lookingAt():"+matcher2.lookingAt());
    }
    public static void ou(){
        System.out.println();
    }
    private static String RE_REGEX="dog";
    private static String RE_INPUT="The dog says meow."+"All dogs say meow.";
    private static String RE_REPLACE="cat";

    public static void method5(){
        Pattern p=Pattern.compile(RE_REGEX);
        Matcher m=p.matcher(RE_INPUT);
        RE_INPUT=m.replaceAll(RE_REPLACE);
        System.out.println(RE_INPUT);
    }


    public static void main(String[] args) {
        ou();
        method1();
        ou();
        method2();
        ou();
        method3();
        ou();
        method4();
        ou();
        method5();
        ou();

    }
}
