package com.java.fortgeschrittenesTutorial;

import java.util.Arrays;
import java.net.URL;
import java.net.URLConnection;


public class JavaArrayDemo {
    public static void main(String[] args) {
        try {
            int size;
            URL url = new URL("http://www.runoob.com/wp-content/themes/runoob/assets/img/newlogo.png");
            URLConnection conn = url.openConnection();
            size = conn.getContentLength();
            if (size < 0)
                System.out.println("无法获取文件大小。");
            else
                System.out.println("文件大小为：" + size + " bytes");
            conn.getInputStream().close();
        }catch (Exception e) {
            e.printStackTrace();
        }

        m2();
        m1();
    }

    public static int[] insertElement(int original[], int element, int index) {
        int length = original.length;
        int destination[] = new int[length + 1];
        System.arraycopy(original, 0, destination, 0, index);
        destination[index] = element;
        System.arraycopy(original, index, destination, index + 1, length - index);
        return destination;
    }
    public static void m2() {
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);
        printArray("数组排序", array);
        int index = Arrays.binarySearch(array, 1);
        System.out.println("元素 1 所在位置（负数为不存在）：" + index);
        int newIndex = -index - 1;
        array = insertElement(array, 1, newIndex);
        printArray("数组添加元素 1", array);
    }
    public static void printArray(String message, int array[]) {
        System.out.println(message + ": [length: " + array.length + "]");
        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(array[i]);
        }
        System.out.println();
    }
    public static void m1() {
        int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
        Arrays.sort(array);
        printArray("数组排序结果为", array);
        int index = Arrays.binarySearch(array, 2);
        System.out.println("元素 2 在第 " + index + " 个位置");
    }

}
