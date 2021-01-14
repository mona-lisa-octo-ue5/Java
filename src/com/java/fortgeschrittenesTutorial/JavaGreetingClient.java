package com.java.fortgeschrittenesTutorial;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.SortedMap;

public class JavaGreetingClient {
    public static void main(String[] args) {

        int port2 =Integer.parseInt(args[0]);
        try {
            Thread t=new GreetingServer(port2);
            t.run();
        }catch (IOException e){
            e.printStackTrace();
        }

        String serverName=args[0];
        int port = Integer.parseInt(args[1]);
        try{
            System.out.println("连接到主机："+serverName+" ,端口号："+port);
            Socket client =new Socket(serverName,port);
            System.out.println("远程主机地址："+client.getRemoteSocketAddress());
            OutputStream outToServer=client.getOutputStream();
            DataOutputStream out=new DataOutputStream(outToServer);
            out.writeUTF("Hello from "+client.getLocalSocketAddress());
            InputStream inFromServer=client.getInputStream();
            DataInputStream in=new DataInputStream(inFromServer);
            System.out.println("服务器响应： "+in.readUTF());
            client.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}

class GreetingServer extends Thread{
    private ServerSocket serverSocket;
    public GreetingServer(int port) throws IOException{
        serverSocket=new ServerSocket(port);
        serverSocket.setSoTimeout(10000);
    }
    public void run(){
        while (true){
            try{
                System.out.println("等待远程连接，端口号为："+serverSocket.getLocalPort()+"...");
                Socket server=serverSocket.accept();
                System.out.println("远程主机地址： "+server.getRemoteSocketAddress());
                DataInputStream in=new DataInputStream(server.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out=new DataOutputStream(server.getOutputStream());
                out.writeUTF("谢谢连接我："+server.getLocalSocketAddress()+"\nGoodbye!");
                server.close();
            }catch (SocketTimeoutException s){
                System.out.println("Socket timed out!");
                return;
            }catch (IOException e){
                e.printStackTrace();
                break;
            }
        }
    }
}