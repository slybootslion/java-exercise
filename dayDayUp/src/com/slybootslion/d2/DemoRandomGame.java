package com.slybootslion.d2;

import java.util.Random;
import java.util.Scanner;

public class DemoRandomGame {
    public static void main(String[] args) {
        int rNum = new Random().nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("输入猜测的数字");
            int num = sc.nextInt();

            if(num <= 0 || num >100) {
                System.out.println("输入数字不在范围之内");
            }else {
                if (num > rNum) {
                    System.out.println("猜大了");
                } else if (num < rNum) {
                    System.out.println("猜小了");
                } else {
                    System.out.println("猜对了");
                    break;
                }
            }
        }
        System.out.println("游戏结束");
    }
}
