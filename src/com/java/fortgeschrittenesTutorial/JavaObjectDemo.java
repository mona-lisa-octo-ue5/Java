package com.java.fortgeschrittenesTutorial;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JavaObjectDemo implements Cloneable {
    String name;
    int likes;
    private List synchedList;
    public JavaObjectDemo(){
        synchedList= Collections.synchronizedList(new LinkedList<>());
    }

    public String removeElement() throws InterruptedException{
        synchronized (synchedList){
            while (synchedList.isEmpty()){
                System.out.println("List is empty...");
                synchedList.wait();
                System.out.println("Waiting...");
            }
            String element=(String) synchedList.remove(0);
            return element;
        }
    }

    public void addElement(String element){
        System.out.println("Opening...");
        synchronized (synchedList){
            synchedList.add(element);
            System.out.println("New Element: "+element+"'");
            synchedList.notifyAll();
            System.out.println("notifyAll called!");
        }
        System.out.println("Closing...");
    }

    public static void main(String[] args) {

        final JavaObjectDemo demo=new JavaObjectDemo();
        Runnable runA=new Runnable() {
            @Override
            public void run() {
                try{
                    String item=demo.removeElement();
                    System.out.println(""+item);
                }catch (InterruptedException ix){
                    System.out.println(ix);
                }
                catch (Exception e){
                    System.out.println(e);
                }
            }
        };
        Runnable runB=new Runnable() {
            @Override
            public void run() {
                demo.addElement("Hello!");
            }
        };

        try{
            Thread threadA1=new Thread(runA, "Google");
            threadA1.start();
            Thread.sleep(500);
            Thread threadA2=new Thread(runA,"Runoob");
            threadA2.start();
            Thread.sleep(500);
            Thread threadB = new Thread(runB, "Taobao");
            threadB.start();

            Thread.sleep(1000);

            threadA1.interrupt();
            threadA2.interrupt();
        }catch (InterruptedException x){

        }

        System.out.println();

        JavaObjectDemo o=new JavaObjectDemo();
        o.name="Runoob";
        o.likes=111;
        System.out.println(o.name);
        System.out.println(o.likes);

        try{
            JavaObjectDemo o2=(JavaObjectDemo) o.clone();
            System.out.println(o2.name);
            System.out.println(o2.likes);
        }catch (Exception e){
            System.out.println(e);
        }


        Object obj1=new Object();
        Object obj2=new Object();
        System.out.println(obj1.equals(obj2));
        Object obj3= obj1;
        System.out.println(obj1.equals(obj3));

        String str1 = new String();
        String str2 = new String();
        System.out.println(str1.equals(str2));
        str1="Runoob";
        str2="Google";
        System.out.println(str1.equals(str2));

    }
}
