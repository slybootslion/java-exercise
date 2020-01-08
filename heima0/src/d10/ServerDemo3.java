package d10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo3 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(39002);
        Socket accept = serverSocket.accept();

        // 接受数据
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
        // 将写入文本文件
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fileTest/netFileWriter.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedWriter.close();
        serverSocket.close();


    }
}
