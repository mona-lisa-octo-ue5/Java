package com.java.fortgeschrittenesTutorial;

public class JavaObjectDemo implements Cloneable {
    String name;
    int likes;

    public static void main(String[] args) {
        JavaObjectDemo o=new JavaObjectDemo();
        o.name="Runoob";
        o.likes=111;
        System.out.println(o.name);
        System.out.println(o.likes);

        try{
            JavaObjectDemo o2=(JavaObjectDemo) o.clone();
            System.out.println(o2.name);
            System.out.println(o2.likes);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
