package com.slybootslion.d1;

public class ArrayMax {
    public static void main(String[] args) {
        int[] array = {2,5,6,8,1000,3000,4,6,43};
        int max= array[0];
        for (int i = 1; i < array.length; i++) {
            if( max < array[i]) max = array[i];
        }
        System.out.println("最大值是：" + max);
    }
}
