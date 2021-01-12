package com.java.pro;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class JavaStreamDemo {
    public static void input(){
        char c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'q'键退出。");
//        do{
//            c = (char) br.read();
//            System.out.println(c);
//        }while (c != 'q');
    }
    public static void main(String[] args) {
        input();
    }
}
