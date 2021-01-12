package com.java.pro;

import java.sql.Struct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
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
        System.out.println();
        parsingStringTime(args);
        System.out.println();
        SleepDemo();
        try{
            System.out.println(new Date()+"\n");
            Thread.sleep(1000*3);
            System.out.println(new Date()+"\n");
        }catch (Exception e){
            System.out.println("Got an exception!");
        }
        System.out.println();
        DiffDemo();
        Calendar c1=Calendar.getInstance();
        int year=c1.get(Calendar.YEAR);
        int month=c1.get(Calendar.MONTH)+1;
        int date2=c1.get(Calendar.DATE);
        int hour=c1.get(Calendar.HOUR_OF_DAY);
        int minute=c1.get(Calendar.MINUTE);
        int second=c1.get(Calendar.SECOND);
        int day=c1.get(Calendar.DAY_OF_WEEK);

        String months[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        int year2;
        GregorianCalendar gcalendar=new GregorianCalendar();
        System.out.print("Date:");
        System.out.print(months[gcalendar.get(Calendar.MONTH)]);
        System.out.print(" "+gcalendar.get(Calendar.DATE)+"/");
        System.out.print(year2=gcalendar.get(Calendar.YEAR));
        System.out.print(" Time:");
        System.out.print(gcalendar.get(Calendar.HOUR)+":");
        System.out.print(gcalendar.get(Calendar.MINUTE)+":");
        System.out.println(gcalendar.get(Calendar.SECOND));
        if (gcalendar.isLeapYear(year2)){
            System.out.println("当前年份是闰年");
        }else {
            System.out.println("当前年份是平年");
        }

    }

    public static void DiffDemo(){
        try{
            long start=System.currentTimeMillis();
            System.out.println(new Date()+"\n");
            Thread.sleep(5*60*10);
            System.out.println(new Date()+"\n");
            long end=System.currentTimeMillis();
            long diff=end-start;
            System.out.println("Difference is:"+diff);
        }catch (Exception e){
            System.out.println("Got an exception");
        }
    }

    public static void SleepDemo(){
        try{
            System.out.println(new Date()+"\n");
            Thread.sleep(1000*3);
            System.out.println(new Date()+"\n");
        }catch (Exception e){
            System.out.println("Got an exception!");
        }
    }

    public static void parsingStringTime(String args[]){
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        String input = args.length == 0 ? "1818-11-11" : args[0];
        System.out.print(input+" Parses as ");
        Date t;
        try{
            t=ft.parse(input);
            System.out.println(t);
        }catch (ParseException e){
            System.out.println("Unparseable using "+ft);
        }
    }

}
