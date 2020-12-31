public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = {12, 45, 98, 73, 60};
        int max = arr[0];
        for (int j : arr) {
            if (j > max) max = j;
        }
        System.out.println("max:" + max);
    }
}
