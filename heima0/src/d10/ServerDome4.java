package d10;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// 客户端配置CLientDome

public class ServerDome4 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(39002);

        while (true) {
            Socket socketAccept = serverSocket.accept();
            // 为每一个客户端开启一个线程
            new Thread(new ServerThread(socketAccept)).start();
        }
    }
}
