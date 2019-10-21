package com.slybootslion.d2;

import java.util.Scanner;

public class DemoStringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入要统计的字符串");
        String input = sc.next();

        int upper = 0;
        int lower = 0;
        int num = 0;
        int other = 0;

        char[] chars = input.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if('A' <= ch && ch <= 'Z'){
                upper++;
            }else if('a' <= ch && ch <= 'z'){
                lower++;
            }else if('0' <= ch && ch <= '9'){
                num++;
            }else{
                other++;
            }
        }

        System.out.println("大写字符数量：" + upper);
        System.out.println("小写字符数量：" + lower);
        System.out.println("数字字符数量：" + num);
        System.out.println("其他字符数量：" + other);
    }
}
