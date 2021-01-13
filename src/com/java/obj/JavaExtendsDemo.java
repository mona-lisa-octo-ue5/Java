package com.java.obj;


class Persion{
}
class Student extends Persion {

}

public class JavaExtendsDemo implements A,B {
    @Override
    public void eat() {
        System.out.println("好好吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("晚上10：30睡觉");
    }

    @Override
    public void show() {
        System.out.println("打开你的健康宝");
    }

    public static void main(String[] args) {
        System.out.println("继承");
        JavaExtendsDemo d=new JavaExtendsDemo();
        d.eat();
        d.sleep();
        d.show();

        Animal a=new Animal("动物",1);
        a.eat();

        Cat c=new Cat("郭金龙狗",1);
        c.eat();
        c.sleep();
        c.introduction();

        c.eatTest();
    }
}



class Animal{
    private String name;
    private int id;
    public Animal(String myName,int myid){
        name=myName;
        id=myid;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction(){
        System.out.println("大家好！我是"+id+"号"+name+".");
    }
}
class Cat extends Animal{
    public Cat(String myName,int myid){
        super(myName,myid);
    }
    public void eat(){
        System.out.println("Cat: eat");
    }
    void eatTest(){
        this.eat();
        super.eat();
    }

}


class Penguin{
    private String name;
    private int id;
    public Penguin(String myName,int myid){
        name=myName;
        id=myid;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction(){
        System.out.println("大家好！我是"+id+"号"+name+".");
    }
}
class Mouse{
    private String name;
    private int id;
    public Mouse(String myName,int myid){
        name=myName;
        id=myid;
    }
    public void eat(){
        System.out.println(name+"正在吃");
    }
    public void sleep(){
        System.out.println(name+"正在睡");
    }
    public void introduction(){
        System.out.println("大家好！我是"+id+"号"+name+".");
    }
}