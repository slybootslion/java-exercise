package d3;

public class stringBuilderIntArrToString {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};

        String s = intArrToString(intArr);
        System.out.println(s);

    }

    public static String intArrToString(int[] arr) {
        StringBuilder sb = new StringBuilder();

        sb.append("[");

        for (int i = 0; i < arr.length; i++) {
            if (arr.length - 1 == i) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]);
                sb.append(", ");
            }
        }

        sb.append("]");


        String s = sb.toString();

        return s;
    }
}
