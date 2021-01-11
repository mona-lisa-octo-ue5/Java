package com.java.pro;

class Vehicle{}

public class Car extends Vehicle{
    public static void main(String[] args) {
        Vehicle a=new Car();
        boolean result=a instanceof Car;
        System.out.println(result);

        int x=10;
        while (x<20){
            System.out.println("value of x:"+x);
            x++;
//            System.out.println("\n");
        }
    }
}
/*
* //今日分享：学习制作计划表（时间表），将你想做的事情写进每一小时里，提醒自己去做，写在纸上贴在墙上
//学习计划：早睡早起，学习饮食规律起来，和平美好的日子里学习每一天
//                                  午休                                                      睡觉
//    6:00 7:00 8:00 9:00 10:00 11:00 12:00 13:00 14:00 15:00 16:00 17:00 18:00 19:00 20:00 21:30
星期一 词语 句子 作文 课文
星期二 99乘法表 算术题
星期三
星期四
星期五
星期六
星期日
* */