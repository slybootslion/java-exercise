package d10;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        // 创建客户端的socket对象
        Socket socket = new Socket("127.0.0.1", 39002);
        // 获取输出流，写数据
        OutputStream os = socket.getOutputStream();
        os.write("这是一条来自客户端的数据！".getBytes());

        // 标记传输结束
        socket.shutdownOutput();

        // 接受服务器返回
        InputStream is = socket.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String s = new String(bys, 0, len);
        System.out.println("客户端接受到的消息：");
        System.out.println(s);

        // 释放资源
        socket.close();
    }

}
