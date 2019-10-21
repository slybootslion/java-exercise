package com.slybootslion.d1;

import java.util.Scanner;

public class ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入第一个数字");
        int a = sc.nextInt();
        System.out.println("输入第二个数字");
        int b = sc.nextInt();

        System.out.println("两个数字之和为：" + (a + b));
    }
}
