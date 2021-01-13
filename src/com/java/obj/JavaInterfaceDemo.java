package com.java.obj;

public class JavaInterfaceDemo implements JavaInterface {
    public static void main(String[] args) {
        System.out.println("接口");

        JavaInterfaceDemo j =new JavaInterfaceDemo();
        j.eat();
        j.travel();
    }

    @Override
    public void eat() {
        System.out.println("大鸭梨吃金牌烤鸭！");
    }

    @Override
    public void travel() {
        System.out.println("海南三亚三日游！");
    }
}
