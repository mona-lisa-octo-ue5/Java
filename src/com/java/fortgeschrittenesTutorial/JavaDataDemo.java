package com.java.fortgeschrittenesTutorial;

import java.util.*;

public class JavaDataDemo {
    public static void main(String[] args) {
        map();
        vector();
        bitset();
        enumeration();
    }
    public static void map(){
        Map m=new HashMap();
        m.put("Zara","8");
        m.put("Mahnaz","31");
        m.put("Ayan","12");
        m.put("Daisy","14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.println("\t"+m);
    }
    public static void vector(){
        Vector v=new Vector(3,2);
        System.out.println("Initial size: "+v.size());
        System.out.println("Initaial capacity: "+v.capacity());
        v.addElement(new Integer(1));
        v.addElement(new Integer(2));
        v.addElement(new Integer(3));
        v.addElement(new Integer(4));
        System.out.println("Capacity after four additions: "+v.capacity());
        v.addElement(new Double(5.45));
        System.out.println("Current capacity: "+v.capacity());
        v.addElement(new Double(6.08));
        v.addElement(new Integer(7));
        System.out.println("Current capacity: "+v.capacity());
        v.addElement(new Float(9.4));
        v.addElement(new Integer(10));
        System.out.println("Current capacity: "+v.capacity());
        v.addElement(new Integer(11));
        v.addElement(new Integer(12));
        System.out.println("First element: "+(Integer)v.firstElement());
        System.out.println("Last element: "+(Integer)v.lastElement());
        if (v.contains(new Integer(3))){
            System.out.println("Vector contains 3.");
        }
        Enumeration vEnum=v.elements();
        System.out.println("\n Elements in vector: ");
        while (vEnum.hasMoreElements()){
            System.out.print(vEnum.nextElement()+" ");
        }
        System.out.println();
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

