package com.java.fortgeschrittenesTutorial;

import com.java.pro.Employee;

import java.io.*;

public class JavaSerializeDemo {
    public static void main(String[] args) {
        serialize();
        deserialize();
    }
    public static void deserialize(){
        JavaGenericsDemo e=null;
        try{
            FileInputStream fileIn=new FileInputStream("/tmp/employee.ser");
            ObjectInputStream in=new ObjectInputStream(fileIn);
            e=(JavaGenericsDemo) in.readObject();
            in.close();
            fileIn.close();
        }catch (IOException i){
            i.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("Employ class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("Name: "+e.name);
        System.out.println("Address: "+e.address);
        System.out.println("SSN: "+e.SSN);
        System.out.println("Number: "+e.number);
    }
    public static void serialize(){
        JavaGenericsDemo e=new JavaGenericsDemo();
        e.name="Reyan Ali";
        e.address="Phokka Kuan, Ambehta Peer";
        e.SSN=11122333;
        e.number=101;
        try{
            FileOutputStream fileOut=new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out=new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized data is saved in /tmp/employee.ser");
        }catch (IOException i){
            i.printStackTrace();
        }

    }
}
