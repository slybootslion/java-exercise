package d1;

import java.util.Random;
import java.util.Scanner;

public class guessNum {

    public static void main(String[] args) {

        Random rn = new Random();
        int num = rn.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("输入猜测的数字：");
            int guessNum = sc.nextInt();

            if (guessNum < num) {
                System.out.println("猜的数字" + guessNum + "小了");
            } else if (guessNum > num) {
                System.out.println("猜的数字" + guessNum + "大了");
            } else {
                System.out.println("恭喜猜对了");
                break;
            }
        }

    }
}
