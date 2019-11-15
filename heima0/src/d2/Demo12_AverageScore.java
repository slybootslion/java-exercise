package d2;

import java.util.Scanner;

public class Demo12_AverageScore {
    public static void main(String[] args) {
        int[] arr = new int[6];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("输入第" + (i + 1) + "位裁判的分数");
            int score = sc.nextInt();
            arr[i] = score;
        }

        // 最高分
        int max = getMaximum(arr, true);

        // 最低分
        int min = getMaximum(arr, false);

        // 总分
        int sum = getSum(arr);

        // 计算得分
        int score = (sum - max - min) / (arr.length - 2);

        // 输出
        System.out.println(score);
    }

    private static int getSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // type为真就取max，否则取min
    private static int getMaximum(int[] arr, boolean type) {
        int num = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (type) {
                if (arr[i] > num) {
                    num = arr[i];
                }
            } else {
                if (arr[i] < num) {
                    num = arr[i];
                }
            }
        }

        return num;
    }


}
