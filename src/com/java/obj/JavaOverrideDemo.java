package com.java.obj;

public class JavaOverrideDemo {
    public static void main(String[] args) {
        Animal2 a=new Animal2();
        Animal2 b=new Dog();
//        a.move();
        b.move();
//        b.bark();

        Overloading o=new Overloading();
        System.out.println(o.test());
        o.test(1);
        System.out.println(o.test(1,"test3"));
        System.out.println(o.test("test4",1));

    }
}
class Overloading{
    public int test(){
        System.out.println("test");
        return 1;
    }
    public void test(int a){
        System.out.println("test2");
    }
    public String test(int a,String s){
        System.out.println("test3");
        return "returnTest3";
    }
    public String test(String s,int a){
        System.out.println("test4");
        return "returnTest4";
    }
}
class Animal2{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog extends Animal2{
    public void move(){
        super.move();
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以叫");
    }
}
