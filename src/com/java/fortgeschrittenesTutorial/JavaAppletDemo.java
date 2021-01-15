package com.java.fortgeschrittenesTutorial;

import java.applet.Applet;
import java.awt.*;

class HelloWorldApplet extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello World",25,50);
    }
}
public class JavaAppletDemo {
    public static void main(String[] args) {
        HelloWorldApplet a=new HelloWorldApplet();

    }
}
