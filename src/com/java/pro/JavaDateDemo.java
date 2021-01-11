package com.java.pro;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class JavaDateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date.toString());

        Date dNow = new Date();
        SimpleDateFormat ft=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        System.out.println("当前时间为："+ft.format(dNow));

        System.out.printf("全部日期和时间信息：%tc%n",date);
        System.out.printf("年-月-日格式：%tF%n",date);
        System.out.printf("月/日/年格式：%tD%n",date);
        System.out.printf("HH:MM:SS PM格式（12时制）：%tr%n",date);
        System.out.printf("HH:MM:SS格式（24小时制）：%tT%n",date);
        System.out.printf("HH:MM格式（24小时制）：%tR",date);
    }

}
