package com.java.pro;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
        System.out.println();
        System.out.printf("%1$s %2$tB %2$td, %2$tY","Due date:",date);
        System.out.println();
        System.out.printf("%s %tB %<te, %<tY", "Due date:", date);
        String str=String.format(Locale.US,"英文月份简称：%tb",date);
        System.out.println(str);
        System.out.printf("本地月份简称：%tb%n",date);
        str=String.format(Locale.US,"英文月份全称：%tB",date);
        System.out.println(str);
        System.out.printf("本地月份全称：%tB%n",date);
        str=String.format(Locale.US,"英文星期的简称：%ta",date);
        System.out.println(str);
        System.out.printf("本地星期的简称：%tA%n",date);
        System.out.printf("年的前两位数字（不足两位前面补0）：%tC%n",date);
        System.out.printf("年的后两位数字（不足两位前面补0）：%ty%n",date);
        System.out.printf("一年中的天数（即年的第几天）：%tj%n",date);
        System.out.printf("两位数字的月份（不足两位前面补0）：%tm%n",date);
        System.out.printf("两位数字的日（不足两位前面补0）：%td%n",date);
        System.out.printf("月份的日（前面不补0）：%te",date);


    }

}
