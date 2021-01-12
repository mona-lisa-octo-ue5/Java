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
    public static double max(double num1,double num2){
        double res;
        if (num1>num2){
            res= num1;
        }else {
            res= num2;
        }
        System.out.println(res);
        return res;
    }
    public static void printt(String[] args){
        for (int i=0;i<args.length;i++){
            System.out.println("args["+i+"]:"+args[i]);
        }
    }

    public static void printMax(double... numbers){
        if (numbers.length==0){
            System.out.println("No argument passed");
            return;
        }
        double result=numbers[0];
        for (int i=1;i<numbers.length;i++){
            if (numbers[i]>result){
                result=numbers[i];
            }
        }
        System.out.println("The max value is "+result);
    }
    public static void main(String[] args) {
        max(5,6);
        printGrade(100);
        nPrintln("ABCD",5);
        max(5.5,6.6);
        String[] args2={"iPhone","iPhoneX"};
        printt(args2);
        MyClass t=new MyClass();
        MyClass t2=new MyClass();
        System.out.println(t.x+" "+t2.x);
        YouClass y=new YouClass(10);
        YouClass y2=new YouClass(20);
        System.out.println(y.y+" "+y2.y);
        printMax(34,3,3,2,56.5);
        printMax(new double[]{1,2,3});
        Cake c=new Cake(1);
        Cake c2=new Cake(2);
        Cake c3=new Cake(3);
        c2 = c3 = null;
        System.gc();
    }
}
class Cake extends Object{
    private int id;
    public Cake(int id){
        this.id=id;
        System.out.println("Cake Object "+id+" is created");
    }
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cake Object "+id+" is disposed");
    }
//    protected void finalize() throws java.lang.Throwable{
//        super.finalize();
//        System.out.println("Cake Object "+id+" is disposed");
//    }
}
class MyClass{
    int x;
    MyClass(){
        x=10;
    }
}
class YouClass{
    int y;
    YouClass(int i){
        y=i;
    }
}