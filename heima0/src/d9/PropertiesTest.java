package d9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileReader fr = new FileReader("fileTest/game.txt");

        // 在文件中读取数据
        properties.load(fr);
        fr.close();

        // 通过集合获取次数
        String count = properties.getProperty("count");
        int Num = Integer.parseInt(count);

        if (Num >= 3) {
            System.out.println("试玩已结束，前往 www.slybootslion.com 充值");
        } else {
            // 玩游戏
            GuessNumber.start();
            // 次数+1，重新写回文件
            Num++;
            properties.setProperty("count", String.valueOf(Num));
            FileWriter fw = new FileWriter("fileTest/game.txt");
            properties.store(fw, null);
            fw.close();
        }

    }
}
