package com.slybootslion.d7;

import java.util.Scanner;

public class DemoRegisterException {
    private static String[] usernames = {"张三", "李四", "王五"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入用户名：");
        String uname = sc.next();

        checkUsername(uname);
    }

    private static void checkUsername(String uname) {
        for (String username : usernames) {
            if (username.equals(uname)) {
                try {
                    throw new RegisterException("用户名已注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }

        System.out.println("注册成功");
    }
}
