package com.java.fortgeschrittenesTutorial;

import java.applet.Applet;
import java.applet.AppletContext;
import java.awt.*;
import java.awt.desktop.AppEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;

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
class ExampleEventHandling extends Applet implements MouseListener{
    StringBuffer strBuffer;
    public void init(){
        addMouseListener(this);
        strBuffer=new StringBuffer();
        addItem("initializing the applet ");
    }
    public void start(){
        addItem("starting the applet ");
    }
    public void stop(){
        addItem("stopping the applet ");
    }
    public void destroy(){
        addItem("unloading the applet ");
    }
    void addItem(String word){
        System.out.println(word);
        strBuffer.append(word);
        repaint();
    }
    public void paint(Graphics g){
        g.drawRect(0,0,getWidth()-1,getHeight()-1);
        g.drawString(strBuffer.toString(),10,20);
    }
    public void mouseEntered(MouseEvent event){

    }
    public void mouseExited(MouseEvent event){

    }
    public void mousePressed(MouseEvent event){

    }
    public void mouseReleased(MouseEvent event){

    }
    public void mouseClicked(MouseEvent event){
        addItem("mouse clicked! ");
    }
}
public class JavaAppletDemo {
    public static void main(String[] args) {
        HelloWorldApplet a=new HelloWorldApplet();

    }
}
class ImageDemo extends Applet{
    private Image image;
    private AppletContext context;
    public void init() {
        context=this.getAppletContext();
        String imageURL=this.getParameter("image");
        if (imageURL==null){
            imageURL="java.jpg";
        }
        try{
            URL url=new URL(this.getDocumentBase(),imageURL);
            image=context.getImage(url);
        }catch (MalformedURLException e){
            e.printStackTrace();
            context.showStatus("Could not load image!");
        }
    }

    public void paint(Graphics g){
        context.showStatus("Displaying image");
        g.drawImage(image,0,0,200,84,null);
        g.drawString("www.javalicense.com",35,100);
    }
}