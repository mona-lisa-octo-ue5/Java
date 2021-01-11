package com.java.pro;

import java.io.UnsupportedEncodingException;


public class StringDemo {
    public static void main(String[] args) {
        char[] helloArray={'r','u','n','o','e','b'};
        String helloString=new String(helloArray);
        System.out.println(helloString);

        String site = "www.runoob.com";
        int len = site.length();
        System.out.println( "菜鸟教程网址长度 : " + len );

        System.out.println("我的名字是 ".concat("Runoob"));

        String s = "www.runoob.com";
        char result2 = s.charAt(6);
        System.out.println(result2);

        String str1 = "Strings";
        String str2 = "Strings";
        String str3 = "Strings123";

        int result = str1.compareTo( str2 );
        System.out.println(result);

        result = str2.compareTo( str3 );
        System.out.println(result);

        result = str3.compareTo( str1 );
        System.out.println(result);

        String str22="String2";
        StringBuffer str33=new StringBuffer("Strings");
        boolean res = str1.contentEquals(str33);
        System.out.println(res);


        char[] Str1 = {'h','e','l','l','o',' '};
        String Str2="";
        Str2= Str2.copyValueOf(Str1);
        System.out.println("返回结果："+Str2);

        Str2 = Str2.copyValueOf(Str1,1,2);
        System.out.println("返回结果："+Str2);

        String strEnds = new String("www.baidu.com");
        res=strEnds.endsWith("com");
        System.out.println("返回值="+res);

        res=Str2.equals(strEnds);
        System.out.println("返回值="+res);

        String strZZ=new String("www.baidu.com");
        System.out.println("返回值："+ strZZ.matches("(.*)baidu(.*)"));

        String strGB=new String("baidu");
        byte[] strGBB=strGB.getBytes();
        System.out.println("返回值："+strGBB);
        strGBB=strGB.getBytes();

    }
}
