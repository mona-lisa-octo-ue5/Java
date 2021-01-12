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

    public static void bank(){
        CheckingAccount c=new CheckingAccount(101);
        System.out.println("Depositing $500...");
        c.deposit(500.00);
        try{
            System.out.println("\n Withdrawing $100...");
            c.withdraw(100.00);
            System.out.println("\n Withdrawing $600...");
            c.withdraw(600.00);
        }catch (InsufficientFundsException e){
            System.out.println("Sorry, but you are short $"+e.getAmount());
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//        exce();
//        exceFinally();
        bank();
    }


}

class CheckingAccount{
    private double balance;
    private int number;
    public CheckingAccount(int number){
        this.number=number;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount) throws InsufficientFundsException{
        if (amount<=balance){
            balance-=amount;
        }else {
            double needs=amount-balance;
            throw new InsufficientFundsException(needs);
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
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