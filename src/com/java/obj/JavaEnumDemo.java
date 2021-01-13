package com.java.obj;

public class JavaEnumDemo {

    enum Color2{
        RED,GREEN,BLUE;
    }

    public static void main(String[] args) {
        Color c=Color.BLUE;
        System.out.println(c);
        Color2 c2=Color2.RED;
        System.out.println(c2);

        for (Color myVar: Color.values()){
            System.out.println(myVar);
        }
    }
}
enum Color {
    RED,GREEN,BLUE;
}
