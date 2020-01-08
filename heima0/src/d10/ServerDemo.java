package d10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo {
    public static void main(String[] args) throws IOException {
        // 创建服务器的Socket对象
        ServerSocket serverSocket = new ServerSocket(39002);
        // 监听客户端连接，返回一个socket对象
        Socket accept = serverSocket.accept();

        // 获取输入流， 读取数据， 在控制台显示数据
        InputStream inputStream = accept.getInputStream();
        byte[] bys = new byte[1024];
        int len = inputStream.read(bys);
        String data = new String(bys, 0, len);
        System.out.println("服务器接收到的消息是： ");
        System.out.println(data);

        // 给出反馈
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("这是一条服务器给出的反馈消息".getBytes());

        // 释放资源
        serverSocket.close();
    }
}
