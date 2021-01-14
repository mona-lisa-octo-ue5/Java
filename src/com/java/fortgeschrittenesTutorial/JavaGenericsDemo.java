package com.java.fortgeschrittenesTutorial;

public class JavaGenericsDemo {
    public static void main(String[] args) {
        Integer[] intArray={1,2,3,4,5};
        Double[] doubleArray={1.1,2.2,3.3,4.4,5.5};
        Character[] charArray={'H','E','L','L','O'};
        System.out.println("整型数组元素为： ");
        printArray(intArray);
        System.out.println("\n 双精度型数组元素为： ");
        printArray(doubleArray);
        System.out.println( "\n字符型数组元素为:" );
        printArray(charArray);
    }
    public static <E> void printArray(E[] inputArray){
        for (E element: inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

}
