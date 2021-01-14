package com.java.fortgeschrittenesTutorial;

import com.java.pro.Employee;

import java.io.*;

public class JavaSerializeDemo {
    public static void main(String[] args) {
        serialize();
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
