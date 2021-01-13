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

        Color myVar=Color.RED;
        switch (myVar){
            case RED:
                System.out.println("红色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
        }
    }
}
enum Color {
    RED,GREEN,BLUE;
}
