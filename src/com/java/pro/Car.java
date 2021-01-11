package com.java.pro;

class Vehicle{}

public class Car extends Vehicle{
    public static void main(String[] args) {
        Vehicle a=new Car();
        boolean result=a instanceof Car;
        System.out.println(result);

        int x=10;
        int y=10;
        while (x<20){
            System.out.println("value of x:"+x);
            x++;
//            System.out.println("\n");
        }

        do{
            System.out.println("value of y:"+y);
            y++;
        }while (y<20);

        for (int i=10;i<20;i++){
            System.out.println("value of i:"+i);
        }

        int [] numbers={10,20,30,40,50};
        for (int i: numbers){
            System.out.print(i);
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names={"James","Larry","Tom","Lacy"};
        for (String name:names){
            System.out.print(name);
            System.out.print(",");
        }

        for (int i:numbers){
            if (i==30){
                break;
            }
            System.out.print(i);
            System.out.print("\n");
        }
        for (int i:numbers){
            if (i==30){
                continue;
            }
            System.out.print(i);
            System.out.print("\n");
        }

        int ab=8;
        float zd=13.65f;
        byte cd=0x4a;

        System.out.println("90度的正xuan值："+Math.sin(Math.PI/2));
        System.out.println("0度的值："+Math.cos(0));
        System.out.println("60度的正切值："+Math.tan(Math.PI/3));
        System.out.println("1的反正切值： " + Math.atan(1));
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));
        System.out.println(Math.PI);
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