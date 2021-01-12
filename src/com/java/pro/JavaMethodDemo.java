package com.java.pro;

import java.sql.SQLSyntaxErrorException;

public class JavaMethodDemo {
    public static int max(int num1,int num2){
        int result;
        if (num1>num2){
            result= num1;
        }else {
            result= num2;
        }
        System.out.println(result);
        return result;
    }
    public static void printGrade(double score){
        if (score>=90.0){
            System.out.println('A');
        }else if (score<=80.0){
            System.out.println('B');
        }else if (score>=70.0){
            System.out.println('C');
        }else if (score>=60.0){
            System.out.println('D');
        }else {
            System.out.println('F');
        }
        //学习方法：每天根据一个故事场景写一段中文。例如：妈妈做早餐给我吃。使用百度翻译App翻译为英文和德文。将每天积累的一段话都写在纸上贴在墙壁上。经常反复记忆朗读。
    }
    public static void nPrintln(String message,int n){
        for (int i=0;i<n;i++){
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        max(5,6);
        printGrade(100);
        nPrintln("ABCD",5);
    }
}
