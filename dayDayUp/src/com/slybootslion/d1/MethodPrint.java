package com.slybootslion.d1;

/*
* 输出指定次数的‘hello world’
* */
public class MethodPrint {
    public static void main(String[] args) {
        printCount(10);
    }

    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("第" + (i + 1) + "次的Hello World");
        }
    }
}
