package com.java.pro;

import java.io.FileInputStream;
import java.rmi.RemoteException;

public class JavaExceptionDemo {

    public static void exce(){
        try{
            int a[]=new int[2];
            System.out.println("Access element three :"+a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :"+e);
        }
        System.out.println("Out of the block");
    }

    public void deposit(double amount) throws RemoteException{
        throw new RemoteException();
    }

    public static void exceFinally(){
        int a[]=new int[2];
        try{
            System.out.println("Access element three :"+a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception throw :"+e);
        }
        finally {
            a[0]=6;
//            System.out.println("First element value: ",+ a[0]);
            System.out.println("The finally statement is executed");
        }
    }

    public static void main(String[] args) {
        exce();
        exceFinally();
    }


}

class InsufficientFundsException extends Exception {
    private double amount;
    public InsufficientFundsException(double amount){
        this.amount=amount;
    }
    public double getAmount(){
        return amount;
    }
}