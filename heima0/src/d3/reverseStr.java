package d3;

import java.util.Scanner;

public class reverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String strArr = sc.nextLine();

        String s = reverseStr(strArr);
        System.out.println(s);
    }

    public static String reverseStr(String sArr) {
        String s = "";

        for (int i = sArr.length() - 1; i >= 0; i--) {
            s += sArr.charAt(i);
        }

        return s;
    }
}
