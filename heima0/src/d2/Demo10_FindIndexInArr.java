package d2;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Demo10_FindIndexInArr {
    public static void main(String[] args) {
        int[] arr = {19, 28, 37, 46, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数：");
        int num = sc.nextInt();

        int res = findIndex(arr, num);
        if (res > -1) {
            System.out.println("数组中该值的下标为：" + res);

        }else {
            System.out.println("数组中没有该值");
        }


    }

    private static int findIndex(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                return i;
            }
        }
        return -1;
    }


}
