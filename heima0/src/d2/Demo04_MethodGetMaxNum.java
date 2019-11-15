package d2;

public class Demo04_MethodGetMaxNum {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 60};

        int maxNum = getMaxNum(arr);
        System.out.println("数组中最大数字为：" + maxNum);
    }

    private static int getMaxNum(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }
}
