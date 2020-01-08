package d10;

import java.io.*;
import java.net.Socket;

public class ServerThread implements Runnable {
    private Socket s;

    public ServerThread(Socket socketAccept) {
        this.s = socketAccept;
    }

    @Override
    public void run() {
        // 接收数据写到文本文件
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(s.getInputStream()));
            int count = 0;
            File file = new File("fileTest/ServerThreadFile[" + count + "].txt");
            while (file.exists()) {
                count++;
                file = new File("fileTest/ServerThreadFile[" + count + "].txt");
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

            // 给出反馈
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
            bw.write("文件复制成功");
            bw.newLine();
            bw.flush();

            // 释放资源
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
