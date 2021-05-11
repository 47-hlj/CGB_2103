package scoket;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//代表客户端IO
//职责：读服务器发来的数据，给服务器写入数据
public class Client {
    public static void main(String[] args) throws IOException {
        //1.连接服务器----服务器ip和端口号
        //Socket(String host,int port)
        Socket  socket=new Socket("176.17.7.100",8000);
        System.out.println("客户端与服务器连接成功......");
        
        //2.取出双向的流
        InputStream in=socket.getInputStream();
        OutputStream out=socket.getOutputStream();
        
        //3.通信
        out.write("hello".getBytes());
        out.flush();

        //接收服务器相应的数据
        for (int i = 0; i < 5; i++) {
            char c=(char) in.read();
            System.out.print(c);
        }

        socket.close();
    }


}
