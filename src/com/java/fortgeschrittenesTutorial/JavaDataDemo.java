package com.java.fortgeschrittenesTutorial;

import java.util.BitSet;
import java.util.Enumeration;
import java.util.Vector;

public class JavaDataDemo {
    public static void main(String[] args) {
        bitset();
        enumeration();
    }
    public static void bitset(){
        BitSet bits1=new BitSet(16);
        BitSet bits2=new BitSet(16);
        for (int i=0;i<16;i++){
            if ((i%2)==0) bits1.set(i);
            if ((i%5)!=0) bits2.set(i);
        }
        System.out.println("Initial pattern in bits1: ");
        System.out.println(bits1);
        System.out.println("\n Initial pattern in bits2: ");
        System.out.println(bits2);

        bits2.and(bits1);
        System.out.println("\n bits2 AND bits1");
        System.out.println(bits2);

        bits2.or(bits1);
        System.out.println("\n bits2 OR bits1: ");
        System.out.println(bits2);

        bits2.xor(bits1);
        System.out.println("\n bits2 XOR bits1: ");
        System.out.println(bits2);
    }
    public static void enumeration(){
        Enumeration<String> days;
        Vector<String> dayNames=new Vector<String>();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        days=dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }
    }
}

