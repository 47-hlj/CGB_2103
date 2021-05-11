package scoket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//代表服务器端IO
//职责：读客户端发来的数据，给客户端写出数据
public class Server {
    public static void main(String[] args) throws IOException {
        //1.创建对象--1025~65535
        ServerSocket server=new ServerSocket(8000);
        System.out.println("服务器已启动......");
        //2.接收客户端发来的连接请求
        //Socket accept()---侦听并接收到此套接字的连接
        Socket socket=server.accept();
        System.out.println("服务器收到一个连接请求......");

        //3.取出双向的流
        InputStream in=socket.getInputStream();
        OutputStream out=socket.getOutputStream();

        //4.通信

        //接收客户端发来的hello
        for (int i = 0; i < 5; i++) {
            char c=(char)in.read();
            System.out.print(c);
        }

        //给客户端发送数据
        out.write("world".getBytes());
        out.flush();

        socket.close();
        server.close();


    }
}
