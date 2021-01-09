package com.java.pro;

public class InstanceCounter {
    private static int numInstances=0;
    protected static int getCount(){
        return numInstances
    }
    private static void addInstance(){
        numInstances++;
    }
    InstanceCounter(){
        InstanceCounter.addInstance();
    }

    public static void main(String[] args) {
        
    }
}
