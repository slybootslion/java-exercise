package com.slybootslion.d1;

import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入第一个数字：");
        int a = sc.nextInt();
        System.out.println("输入第二个数字：");
        int b = sc.nextInt();
        System.out.println("输入第三个数字：");
        int c = sc.nextInt();

        int temp = Math.max(a, b);
        int max = Math.max(temp, c);

        System.out.println("三个数中最大的是：" + max);

    }
}
