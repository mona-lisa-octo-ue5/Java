package com.java.fortgeschrittenesTutorial;

import com.sun.jdi.event.ExceptionEvent;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;
    RunnableDemo(String name){
        threadName=name;
        System.out.println("Creating "+threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+threadName);
        try{
            for (int i=4;i>0;i--){
                System.out.println("Thread: "+threadName+","+i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread "+threadName+" interrupted.");
        }
        System.out.println("Thread "+threadName+" exiting.");
    }

    public void start(){
        System.out.println("Starting "+threadName);
        if (t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}
class ThreadDemo extends Thread{
    private Thread t;
    private String threadName;
    ThreadDemo(String name){
        threadName=name;
        System.out.println("Creating "+threadName);
    }

    public void run() {
        System.out.println("Running "+threadName);
        try{
            for (int i=4;i>0;i--){
                System.out.println("Thread: "+threadName+","+i);
                Thread.sleep(50);
            }
        }catch (InterruptedException e){
            System.out.println("Thread: "+threadName+" interrupted.");
        }
        System.out.println("Thread "+threadName+" exiting.");
    }

    public void start(){
        System.out.println("Starting "+threadName);
        if (t==null){
            t=new Thread(this,threadName);
            t.start();
        }
    }
}

class DisplayMessage implements Runnable{
    private String message;
    public DisplayMessage(String message){
        this.message=message;
    }
    public void run(){
        while (true){
            System.out.println(message);
        }
    }
}
class CallableThreadTest implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        int i=0;
        for (;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
        return i;
    }
}
public class JavaThreadDemo {
    public static void main(String[] args) {
        RunnableDemo r=new RunnableDemo("Thread-1");
        r.start();
        RunnableDemo r2=new RunnableDemo("Thread-2");
        r2.start();
        ThreadDemo t=new ThreadDemo("Thread-1-1");
        t.start();
        ThreadDemo t2=new ThreadDemo("Thread-2-2");
        t2.start();

        CallableThreadTest c=new CallableThreadTest();
        FutureTask<Integer> f=new FutureTask<>(c);
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" 的循环变量i 的值"+i);
            if (20==i){
                new Thread(f,"有返回值的线程").start();
            }
        }
        try{
            System.out.println("子线程的返回值： "+f.get());
        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
