package d9;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private GuessNumber() {
    }

    public static void start() {
        Random random = new Random();
        int num = random.nextInt(100) + 1; // 随机整数1~100

        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你要猜的数字：");
            int guessNum = sc.nextInt();

            if (guessNum > num) {
                System.out.println("你猜的数字" + guessNum + "大了");
            } else if (guessNum < num) {
                System.out.println("你猜的数字" + guessNum + "小了");
            } else {
                System.out.println("恭喜猜中");
                break;
            }
        }
    }

}
