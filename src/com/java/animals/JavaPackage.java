package com.java.animals;
interface Animal{
    public void eat();
    public void travel();
}
public class JavaPackage implements Animal {
    @Override
    public void eat() {
        System.out.println("JavaPackage eats");
    }

    @Override
    public void travel() {
        System.out.println("JavaPackage travels");
    }

    public int noOfLegs(){
        return 0;
    }

    public static void main(String[] args) {
        JavaPackage m=new JavaPackage();
        m.eat();
        m.travel();
    }
}
