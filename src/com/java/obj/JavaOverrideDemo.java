package com.java.obj;

import javax.swing.plaf.SliderUI;

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

         show(new Cat3());
         show(new Dog3());
         Animal3 a3=new Cat3();
         a3.eat();
         Cat3 c=(Cat3) a3;
         c.work();

        Salary s=new Salary("员工 A","北京",3,36000.00);
        Employee e=new Salary("员工 B","上海",2,24000.00);
        System.out.println("使用 Salary 的引用调用 mailCheck -- ");
        s.mailCheck();
        System.out.println("\n使用 Employee 的引用调用 mailCheck --");
        e.mailCheck();


    }

    public static void show(Animal3 a){
        a.eat();
        if (a instanceof Cat3){
            Cat3 c=(Cat3) a;
            c.work();
        }else if (a instanceof Dog3){
            Dog3 c=(Dog3) a;
            c.work();
        }
    }
}
class Salary extends Employee{
    private double salary;
    public Salary(String name,String address,int number,double salary){
        super(name,address,number);
        setSalary(salary);
    }
    public void setSalary(double newSalary){
        if (newSalary>=0.0){
            salary=newSalary;
        }
    }
    public void mailCheck(){
        System.out.println("Salary 类的 mailCheck 方法");
        System.out.println("邮寄支票给："+getName()+" ，工资为"+salary);
    }
    public double getSalary(){
        return salary;
    }
    public double computePay(){
        System.out.println("计算工资，付给："+getName());
        return salary/52;
    }
}
class Employee{
    private String name;
    private String address;
    private int number;
    public Employee(String name,String address,int number){
        System.out.println("Employee 构造函数");
        this.name=name;
        this.address=address;
        this.number=number;
    }
    public void mailCheck(){
        System.out.println("邮寄支票给："+this.name+" "+this.address);
    }
    public String toString(){
        return name+" "+address+" "+number;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String newAddress){
        address=newAddress;
    }
    public int getNumber(){
        return number;
    }
}

abstract class Animal3{
    abstract void eat();
}
class Cat3 extends Animal3{
    public void eat(){
        System.out.println("吃鱼");
    }
    public void work(){
        System.out.println("抓老鼠");
    }
}
class Dog3 extends Animal3{
    public void eat(){
        System.out.println("吃骨头");
    }
    public void work(){
        System.out.println("看家");
    }
}
class Shape{
    void draw(){}
}
class Circle extends Shape{
    void draw() {
        System.out.println("Circle draw");
    }
}
class Square extends Shape{
    void draw() {
        System.out.println("Square draw");
    }
}
class Triangle extends Shape{
    void draw(){
        System.out.println("Triangle draw");
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
