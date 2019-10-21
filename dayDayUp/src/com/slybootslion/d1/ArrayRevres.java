package com.slybootslion.d1;

public class ArrayRevres {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        printArr(arr);

        System.out.println("=================");

        for (int min = 0, max = arr.length - 1; min < max; min++, max--) {
            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
        }

        printArr(arr);

    }

    // 打印数组
    private static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
