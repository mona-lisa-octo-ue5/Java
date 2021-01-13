package com.java.obj;

import java.security.PublicKey;

enum Color3 {
    RED{
        public String getColor() {
            return "红色";
        }
    },
    GREEN{
        public String getColor(){
            return "绿色";
        }
    },
    BLUE{
        public String getColor(){
            return "蓝色";
        }
    };
    public abstract String getColor();
}
public class JavaEnumDemo {

    enum Color2{
        RED,GREEN,BLUE;

        private Color2(){
            System.out.println("Constructor called for: "+this.toString());
        }
        public void colorInfo(){
            System.out.println("Universal Color");
        }
    }

    public static void main(String[] args) {

        Color[] arr = Color.values();
        for (Color col: arr){
            System.out.println(col+" at index "+col.ordinal());
        }
        System.out.println(Color.valueOf("BLUE"));

        Color c=Color.BLUE;
        System.out.println(c);
        Color2 c2=Color2.RED;
        System.out.println(c2);
        c2.colorInfo();

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

        for (Color3 c3: Color3.values()){
            System.out.println(c3.getColor()+"、");
        }

    }
}
enum Color {
    RED,GREEN,BLUE;
}
