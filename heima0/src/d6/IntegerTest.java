package d6;

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";

        String[] strArr = s.split(" ");

        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.sort(intArr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < intArr.length; i++) {
            if (i == intArr.length - 1) {
                sb.append(intArr[i]);
            } else {
                sb.append(intArr[i]).append(" ");
            }
        }
        String s2 = sb.toString();
        System.out.println(s2);
    }
}
