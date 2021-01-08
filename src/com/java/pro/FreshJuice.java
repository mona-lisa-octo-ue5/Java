package com.java.pro;

class  Fresh{
    enum FreshJuiceSize{ SMALL,MEDIUM,LARGE }
    FreshJuiceSize size;
}
public class FreshJuice {
    public static void main(String[] args) {
        Fresh f=new Fresh();
        f.size=Fresh.FreshJuiceSize.MEDIUM;
    }
}
