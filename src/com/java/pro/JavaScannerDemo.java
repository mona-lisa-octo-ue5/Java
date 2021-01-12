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

    public static void scannerNextLine(){
        Scanner scan=new Scanner(System.in);
        System.out.println("nextLine方式接收：");
        if (scan.hasNextLine()){
            String str2 =scan.nextLine();
            System.out.println("输入的数据为："+str2);
        }
        scan.close();
    }

    public static void scannerDemo(){
        Scanner scan=new Scanner(System.in);
        int i=0;
        float f=0.0f;
        System.out.print("输入整数：");
        if (scan.hasNextInt()){
            i=scan.nextInt();
            System.out.println("整数数据："+i);
        }else {
            System.out.println("输入的不是整数！");
        }
        System.out.print("输入小数：");
        if (scan.hasNextFloat()){
            f=scan.nextFloat();
            System.out.println("小数数据："+f);
        }else {
            System.out.println("输入的不是小数！");
        }
        scan.close();
    }

    public static void main(String[] args) {
//        scanner();
//        scannerNextLine();
        scannerDemo();
    }


}
