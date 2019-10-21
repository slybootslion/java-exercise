package com.slybootslion.d1;

public class ArrayReturn {
    public static void main(String[] args) {
        int[] res = calculate(10, 20, 3);
        System.out.println("合计：" + res[0]);
        System.out.println("平均数：" + res[1]);
    }

    private static int[] calculate(int a, int b, int c) {
        int sum = a + b + c;
        int avg = sum / 3;
        return new int[]{sum, avg};
    }
}
