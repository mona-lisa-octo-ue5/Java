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

    public static void main(String[] args) {
        exce();
        

    }


}
