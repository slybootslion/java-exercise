package com.slybootslion.d1;

public class MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10, 20));
        System.out.println(isSame(20, 20));
    }

    public static Boolean isSame(int a, int b){
        return a == b;
    }
}
