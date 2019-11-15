package d2;

public class Demo03_MethodArrayFor {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        forEachArr(arr);
    }

    private static void forEachArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
