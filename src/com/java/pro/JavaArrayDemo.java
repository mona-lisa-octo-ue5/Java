package com.java.pro;

public class JavaArrayDemo {
//    double[] myList;
//    double myList2[];
public static void main(String[] args) {

    int size = 10;
    double[] myList = new double[size];
    myList[0]=5.6;
    myList[1]=4.5;
    myList[2]=3.3;
    myList[3]=13.2;
    myList[4]=4.0;
    myList[5] = 34.33;
    myList[6] = 34.0;
    myList[7] = 45.45;
    myList[8] = 99.993;
    myList[9] = 11123;
    double total = 0;
    for (int i=0; i < size ; i++) {
        total += myList[i];
    }
    System.out.println("总和为："+total);

    double[] myList2 = {1.9,2.9,3.4,3.5};
    for (int i=0; i<myList2.length; i++){
        System.out.println(myList2[i]+" ");
    }
    double total2=0;
    for (int i=0;i<myList2.length;i++){
        total2+=myList2[i];
    }
    System.out.println("Total is "+total2);
    double max = myList2[0];
    for (int i=1; i <myList2.length; i++){
        if (myList2[i]>max) max=myList2[i];
    }
    System.out.println("Max is "+max);
}

}
