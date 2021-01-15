package com.java.fortgeschrittenesTutorial;

import java.applet.Applet;
import java.awt.*;

class HelloWorldApplet extends Applet{
    public void paint(Graphics g){
        g.drawString("Hello World",25,50);
    }
    int squareSize=50;
    public void init(){
        String squareSizeParam=getParameter("squareSize");
        parseSquareSize(squareSizeParam);
        String colorParam=getParameter("Color");
        Color fg=parseColor(colorParam);
        setBackground(Color.black);
        setForeground(fg);
    }
    private void parseSquareSize(String param){
        if (param==null) return;
        try{
            squareSize=Integer.parseInt(param);
        }catch (Exception e){
            
        }
    }
    private Color parseColor(String param){}


}
public class JavaAppletDemo {
    public static void main(String[] args) {
        HelloWorldApplet a=new HelloWorldApplet();

    }
}
