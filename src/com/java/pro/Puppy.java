package com.java.pro;

public class Puppy {
    int puppyAge;
    public void setAge(int age){
        puppyAge=age;
    }
    public int getAge(){
        System.out.println("小狗的年龄为："+puppyAge);
        return puppyAge;
    }
    public Puppy() {

    }
    public Puppy(String name) {
        System.out.println("小狗的名字是："+name);
    }

    public static void main(String[] args) {
        Puppy p = new Puppy("郭金龙");
        p.setAge(2);
        p.getAge();
        System.out.println("变量值："+p.puppyAge);
    }
}
