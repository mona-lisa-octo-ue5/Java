package com.java.pro;

import java.util.Scanner;

public class JavaScannerDemo {


    public static void scanner(){
        Scanner scan=new Scanner(System.in);
        System.out.println("next 方式接收：");
        if (scan.hasNext()){
            String str1=scan.next();
            System.out.println("输入的数据为："+str1);
        }
        scan.close();
    }

    public static void main(String[] args) {
        scanner();
    }

}
