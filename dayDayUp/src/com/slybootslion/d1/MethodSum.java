package com.slybootslion.d1;

/*
* 求1-100数的和
* */

public class MethodSum {
    public static void main(String[] args) {
        System.out.println("结果是：" + getSum());
    }

    public static int getSum(){
        int sum = 0;
        for (int i = 0; i < 101; i++) {
            sum += i;
        }
        return sum;
    }
}
