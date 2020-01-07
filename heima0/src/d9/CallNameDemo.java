package d9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class CallNameDemo {
    public static void main(String[] args) throws IOException {
        // 字符缓冲输入流对象
        BufferedReader br = new BufferedReader(new FileReader("fileTest/dirTwo/nameFile.txt"));

        // 创建ArryayList对象
        ArrayList<String> arr = new ArrayList<>();

        // 调用字符缓冲输入流对象的方法读取数据
        String line;
        while ((line = br.readLine()) != null) {
            // 读取的数据存入Arraylist
            arr.add(line);
        }

        // 释放资源
        br.close();

        // 产生随机数
        Random random = new Random();
        int idx = random.nextInt(arr.size());

        // 获取arrayList的值
        String name = arr.get(idx);

        // 输出姓名
        System.out.println("随机得到的姓名为：" + name);

    }
}
