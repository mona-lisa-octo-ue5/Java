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
    public static void fileStreamTest2(){
        try {
            File f=new File("a.txt");
            FileOutputStream fop=new FileOutputStream(f);
            OutputStreamWriter writer=new OutputStreamWriter(fop,"UTF-8");
            writer.append("中文输入");
            writer.append("\r\n");
            writer.append("English");
            writer.close();
            fop.close();
            FileInputStream fip=new FileInputStream(f);
            InputStreamReader reader=new InputStreamReader(fip,"UTF-8");
            StringBuffer sb=new StringBuffer();
            while (reader.ready()){
                sb.append((char) reader.read());
            }
            System.out.println(sb.toString());
            reader.close();
            fip.close();
        }catch (Exception e){
            System.out.println(e.getLocalizedMessage());
        }
    }
    public static void createDir(){
        String dirname="/tmp/user/java/bin";
        File d=new File(dirname);
        d.mkdir();
    }
    public static void DirList(){
        String dirname="/tmp";
        File f1=new File(dirname);
        if (f1.isDirectory()){
            System.out.println("目录 "+dirname);
            String s[] =f1.list();
            for (int i=0; i<s.length; i++){
                File f =new File(dirname+"/"+s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i]+" 是一个目录");
                }else {
                    System.out.println(s[i]+" 是一个文件");
                }
            }
        }else {
            System.out.println(dirname+" 不是一个目录");
        }
    }
    public static void main(String[] args) {
//        input();
//        input2();
//        write();
//        fileStreamTest();
//        fileStreamTest2();
//        createDir();
        DirList();

    }

}
