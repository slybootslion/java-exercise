package d3;

public class intArrToString {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4};
        String str = toStringFun(intArr);

        System.out.println(str);
    }

    public static String toStringFun(int[] arr) {
        String str = "";

        str += "[";

        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                str += arr[i];
            } else {
                str += arr[i] + ", ";
            }
        }

        str += "]";

        return str;
    }
}
