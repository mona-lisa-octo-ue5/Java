package com.java.obj;

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
    }
}
enum Color {
    RED,GREEN,BLUE;
}
