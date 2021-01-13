package com.java.obj;


class Persion{
}
class Student extends Persion {

}

public class JavaExtendsDemo {


    public static void main(String[] args) {
        System.out.println("继承");
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