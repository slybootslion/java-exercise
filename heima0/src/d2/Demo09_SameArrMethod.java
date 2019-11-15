package d2;

public class Demo09_SameArrMethod {
    public static void main(String[] args) {

        int[] arr = {11, 22, 33, 44, 55};
        int[] arr2 = {11, 22, 33, 44, 55};

        boolean res = sameArr(arr, arr2);
        System.out.println(res);
    }

    private static boolean sameArr(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
