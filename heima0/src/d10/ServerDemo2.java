package d10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {
    public static void main(String[] args) throws IOException {
        // 创建服务器socket对象
        ServerSocket serverSocket = new ServerSocket(39002);

        // 监听客户端连接
        Socket ac = serverSocket.accept();

        // 获取输入流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ac.getInputStream()));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        // 释放资源
        serverSocket.close();
    }
}
