package com.java.fortgeschrittenesTutorial;

import javax.xml.crypto.Data;
import java.io.*;
import java.net.*;
import java.util.SortedMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

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
class Server{
    public static void myMain(String[] args) {
        int port=getPort(args);
        ServerSocket server=null;
        ExecutorService service = Executors.newFixedThreadPool(50);
        try{
            server=new ServerSocket(port);
            System.out.println("Server started!");
            while (true){
                Socket socket=server.accept();
                service.execute(new Handler(socket));
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (server!=null){
                try{
                    server.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            server=null;
        }
    }
    static class Handler implements Runnable{
        Socket socket=null;
        public Handler(Socket socket){
            this.socket=socket;
        }

        @Override
        public void run() {
            BufferedReader reader=null;
            PrintWriter writer=null;
            try{
                reader=new BufferedReader(new InputStreamReader(socket.getInputStream(),"UTF-8"));
                writer=new PrintWriter(new OutputStreamWriter(socket.getOutputStream(),"UTF-8"));
                String readMessage=null;
                while (true){
                    System.out.println("server reading... ");
                    if ((readMessage=reader.readLine())==null){
                        break;
                    }
                    System.out.println(readMessage);
                    writer.println("server recive: "+readMessage);
                    writer.flush();
                }
            }catch (Exception e){
                e.printStackTrace();
            }finally {
                if (socket!=null){
                    try{
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
                socket=null;
                if (reader!=null){
                    try {
                        reader.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }
                }
                reader=null;
                if (writer!=null){
                    writer.close();
                }
                writer=null;
            }
        }
    }
    private static int getPort(String[] args){
        if (args.length>0){
            try{
                return Integer.parseInt(args[0]);
            }catch (NumberFormatException e){
                return 9999;
            }
        }else {
            return 9999;
        }
    }
}
class UPDServer{
    public static void myMain(String[] args) {
        try{
            DatagramSocket server=new DatagramSocket(5060);
            DatagramPacket packet=new DatagramPacket(new byte[1024],1024);
            server.receive(packet);
            System.out.println(packet.getAddress().getHostName()+"("+packet.getPort()+")"+new String(packet.getData()));
            packet.setData("Hello Client".getBytes());
            packet.setPort(5070);
            packet.setAddress(InetAddress.getLocalHost());
            server.send(packet);
            server.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
class UDPClient{
    public static void mymain(String[] args) {
        try{
            DatagramSocket client=new DatagramSocket(5070);
            DatagramPacket packet=new DatagramPacket(new byte[1024],1024);
            packet.setPort(5060);
            packet.setAddress(InetAddress.getLocalHost());
            packet.setData("Hello Server".getBytes());
            client.send(packet);
            client.receive(packet);
            System.out.println(packet.getAddress().getHostName()+"("+packet.getPort()+")"+new String(packet.getData()));
            client.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}