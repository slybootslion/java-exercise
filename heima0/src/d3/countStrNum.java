package d3;

import java.util.Scanner;

public class countStrNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入要统计的字符串");
        String line = sc.nextLine();


        int countBig = 0;
        int countSmall = 0;
        int countNum = 0;

        for (int i = 0; i < line.length(); i++) {
            char ca = line.charAt(i);

            if (ca >= 'A' && ca <= 'Z') {
                countBig++;
            } else if (ca >= 'a' && ca <= 'z') {
                countSmall++;
            } else {
                countNum++;
            }
        }

        System.out.println("大写字母个数：" + countBig);
        System.out.println("小写字母个数：" + countSmall);
        System.out.println("数字个数：" + countNum);
    }
}
