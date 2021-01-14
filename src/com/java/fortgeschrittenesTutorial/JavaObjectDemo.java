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


        Object obj1=new Object();
        Object obj2=new Object();
        System.out.println(obj1.equals(obj2));
        Object obj3= obj1;
        System.out.println(obj1.equals(obj3));

        String str1 = new String();
        String str2 = new String();
        System.out.println(str1.equals(str2));
        str1="Runoob";
        str2="Google";
        System.out.println(str1.equals(str2));

    }
}
