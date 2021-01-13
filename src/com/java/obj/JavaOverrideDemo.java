package com.java.obj;

public class JavaOverrideDemo {
    public static void main(String[] args) {
        Animal2 a=new Animal2();
        Animal2 b=new Dog();
        a.move();
        b.move();
    }
}
class Animal2{
    public void move(){
        System.out.println("动物可以移动");
    }
}
class Dog extends Animal2{
    public void move(){
        System.out.println("狗可以跑和走");
    }
}
