package d10;

import java.io.*;
import java.net.Socket;

public class ClientDemo3 {
    public static void main(String[] args) throws IOException {
        // 创建客户端socket对象
        Socket socket = new Socket("127.0.0.1", 39002);

        // 数据来自键盘录入
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            if ("886".equals(line)) break;

//            数据输出
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        socket.close();
    }
}
