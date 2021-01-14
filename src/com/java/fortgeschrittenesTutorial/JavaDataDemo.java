package com.java.fortgeschrittenesTutorial;

import com.java.obj.A;

import java.util.*;

public class JavaDataDemo {
    public static void main(String[] args) {
        hashMap();
        arrayList();
        removeIterator();
        iterator();
        properties();
        hashtable();
        map();
        vector();
        bitset();
        enumeration();
    }
    public static void hashMap(){
        Map<String,String> map=new HashMap<String,String>();
        map.put("1","value1");
        map.put("2","value2");
        map.put("3","value3");
        System.out.println("通过Map.keySet遍历key 和value: ");
        for (String key: map.keySet()){
            System.out.println("key= "+key+" and value= "+map.get(key));
        }
        System.out.println("通过Map.entrySet使用iterator遍历key和value：");
        Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,String> entry=it.next();
            System.out.println("key= "+entry.getKey()+" add value= "+entry.getValue());
        }

        System.out.println("通过Map.entrySet遍历key和value");
        for (Map.Entry<String,String> entry: map.entrySet()){
            System.out.println("key= "+entry.getKey()+" and value = "+entry.getValue());
        }

        System.out.println("通过Map.values()遍历所有的value，但不能遍历key");
        for (String v: map.values()){
            System.out.println("value= "+v);
        }
    }
    public static void arrayList(){
        List<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");
        for (String str: list){
            System.out.println(str);
        }

        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for (int i=0;i<strArray.length;i++){
            System.out.println(strArray[i]);
        }

        Iterator<String> ite=list.iterator();
        while (ite.hasNext()){
            System.out.println(ite.next());
        }
    }
    public static void removeIterator(){
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        numbers.add(5);
        Iterator<Integer> it=numbers.iterator();
        while (it.hasNext()){
            Integer i=it.next();
            if (i<10){
                it.remove();
            }
        }
        System.out.println(numbers);
    }
    public static void iterator(){
        ArrayList<String> sites=new ArrayList<String>();
        sites.add("Google");
        sites.add("Runoob");
        sites.add("Taobao");
        sites.add("Zhihu");
        Iterator<String> it =sites.iterator();
        System.out.println(it.next());
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void properties(){
        Properties capitals=new Properties();
        Set states;
        String str;
        capitals.put("Illinois","Springfield");
        capitals.put("Missouri","Jefferson City");
        capitals.put("Washington", "Olympia");
        capitals.put("California","Sacramento");
        capitals.put("Indiana","Indianapolis");
        states = capitals.keySet();
        Iterator itr = states.iterator();
        while (itr.hasNext()){
            str=(String) itr.next();
            System.out.println("The capital of "+str+" is "+capitals.getProperty(str)+".");
        }
        System.out.println();
        str= capitals.getProperty("Florida","Not Found");
        System.out.println("The capital of Florida is "+str+".");
    }
    public static void hashtable(){
        Hashtable balance=new Hashtable();
        Enumeration names;
        String str;
        double bal;
        balance.put("Zara",new Double(3434.34));
        balance.put("Mahnaz",new Double(123.22));
        balance.put("Ayan",new Double(1378.00));
        balance.put("Daisy",new Double(99.22));
        balance.put("Qadir",new Double(-19.08));
        names=balance.keys();
        while (names.hasMoreElements()){
            str=(String) names.nextElement();
            System.out.println(str+": "+balance.get(str));
        }
        System.out.println();
        bal=((Double)balance.get("Zara")).doubleValue();
        balance.put("Zara",new Double(bal+1000));
        System.out.println("Zara's new balance: "+balance.get("Zara"));
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

