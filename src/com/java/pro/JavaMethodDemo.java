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

    public static void main(String[] args) {
        max(5,6);
    }
}
