package d10;

import java.io.*;
import java.net.Socket;

public class ClientDemo2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 39002);

        // 读取文件 输出流写数据
        BufferedReader bufferedReader = new BufferedReader(new FileReader("fileTest/netFileWriter.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }

        bufferedReader.close();
        bufferedWriter.close();
        socket.close();

    }
}
