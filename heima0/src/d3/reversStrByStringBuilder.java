package d3;

import java.util.Scanner;

public class reversStrByStringBuilder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("输入一个字符串");
        String s = sc.nextLine();

        String s1 = reversString(s);
        System.out.println(s1);

    }

    public static String reversString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
