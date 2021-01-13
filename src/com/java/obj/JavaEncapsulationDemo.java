package com.java.obj;

public class JavaEncapsulationDemo {

    public static void main(String[] args) {
        Encap encap=new Encap();
        encap.setAge(20);
        encap.setName("James");
        encap.setIdNum("12345ms");
        System.out.println("Name: "+encap.getName()+" Age: "+encap.getAge());
    }
}
class Encap{
    private String name;
    private String idNum;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getIdNum() {
        return idNum;
    }

    public void setAge(int newAge) {
        age=newAge;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setIdNum(String newIdNum) {
        idNum = newIdNum;
    }
}
class Person{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
