package d2;

public class Demo08_ArrayAdd {
    // 数组求和 只有 偶数 个位和十位不带7的数字参与求和

    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};

        int addNum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 != 7 && arr[i] / 10 % 10 != 7 && arr[i] % 2 == 0) {
                addNum += arr[i];
            }
        }
        System.out.println(addNum);
    }
}
