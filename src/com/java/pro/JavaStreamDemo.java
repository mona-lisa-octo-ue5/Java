package com.java.pro;

import java.io.*;

public class JavaStreamDemo {
    public static void input(){
        char c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下'q'键退出。");
        try{
            do{
                c = (char) br.read();
                System.out.println(c);
            }while (c != 'q');
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void input2(){
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        try{
            do {
                str=br.readLine();
                System.out.println(str);
            }while (!str.equals("end"));
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
    public static void write(){
        int b;
        b='A';
        System.out.write(b);
        System.out.write('\n');
    }

    public static void fileStreamTest(){
        try{
            byte bWrite[] ={11,21,3,40,5};
            OutputStream os=new FileOutputStream("test.txt");
            for (int x=0;x<bWrite.length;x++){
                os.write(bWrite[x]);
            }
            os.close();
            InputStream is=new FileInputStream("test.txt");
            int size =is.available();
            for (int i=0;i<size;i++){
                System.out.print((char) is.read()+" ");
            }
            is.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public static void main(String[] args) {
//        input();
//        input2();
//        write();
//        fileStreamTest();
        
    }
}
