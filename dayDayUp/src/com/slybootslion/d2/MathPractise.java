package com.slybootslion.d2;

public class MathPractise {
    public static void main(String[] args) {
        int count = 0;

        double min = -10.8;
        double max = 5.9;

        for (double i = Math.ceil(min); i < max; i++) {
            double num = Math.abs(i);
            if(num > 6 || num < 2.1){
//                System.out.println(num);
                count++;
            }
        }

        System.out.println("绝对值中大于6小于2.1的数量有：" + count + "个");
    }
}
