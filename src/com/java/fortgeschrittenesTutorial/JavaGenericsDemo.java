package com.java.fortgeschrittenesTutorial;

import java.util.ArrayList;
import java.util.List;

public class JavaGenericsDemo implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;
    public void mailCheck(){
        System.out.println("Mailing a check to "+name+" "+address);
    }


    public static void main(String[] args) {

        List<String> name=new ArrayList<String>();
        List<Integer> age=new ArrayList<Integer>();
        List<Number> number=new ArrayList<Number>();
        name.add("icon");
        age.add(18);
        number.add(314);
        getData(name);
        getData(age);
        getData(number);

        Box<Integer> integerBox=new Box<Integer>();
        Box<String> stringBox=new Box<String>();
        integerBox.add(new Integer(10));
        stringBox.add(new String("菜鸟教程"));
        System.out.printf("整型值为： %d\n\n",integerBox.get());
        System.out.printf("字符串为：%s\n",stringBox.get());

        System.out.printf("%d, %d 和 %d 中最大的数为 %d\n\n",3,4,5,maximum(3,4,5));
        System.out.printf("%.1f, %.1f 和 %.1f 中最大的数为 %.1f\n\n",6.6,8.8,7.7,maximum(6.6,8.8,7.7));
        System.out.printf("%s, %s 和 %s 中最大的数为 %s\n","pear","apple","orange",maximum("pear","apple","orange"));

        Integer[] intArray={1,2,3,4,5};
        Double[] doubleArray={1.1,2.2,3.3,4.4,5.5};
        Character[] charArray={'H','E','L','L','O'};
        System.out.println("整型数组元素为： ");
        printArray(intArray);
        System.out.println("\n 双精度型数组元素为： ");
        printArray(doubleArray);
        System.out.println( "\n字符型数组元素为:" );
        printArray(charArray);
    }
    public static void getData(List<?> data){
        System.out.println("data: "+data.get(0));
    }
    public static <T extends Comparable<T>> T maximum(T x, T y, T z){
        T max=x;
        if (y.compareTo(max)>0){
            max=y;
        }
        if (z.compareTo(max)>0){
            max=z;
        }
        return max;
    }
    public static <E> void printArray(E[] inputArray){
        for (E element: inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

}
class Box<T>{
    private T t;
    public void add(T t){
        this.t=t;
    }
    public T get(){
        return t;
    }
}