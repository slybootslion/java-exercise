package d7;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
//        String str = "aababcabcdabcde";

        System.out.println("输入一个字符串");
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        TreeMap<Character, Integer> tm = new TreeMap<>();

        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            Integer num = tm.get(c);

            if (num == null) {
                tm.put(c, 1);
            } else {
                num++;
                tm.put(c, num);
            }
        }

        StringBuilder sb = new StringBuilder();

        Set<Character> keys = tm.keySet();

        for (Character key : keys) {
            sb.append(key).append("(").append(tm.get(key)).append(")");
        }

        System.out.println(sb.toString());
    }
}
