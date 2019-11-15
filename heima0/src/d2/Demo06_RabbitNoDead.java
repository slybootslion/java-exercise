package d2;

public class Demo06_RabbitNoDead {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        System.out.println("第" + arr.length + "个月有" + arr[arr.length - 1] + "对兔子。");

    }
}
