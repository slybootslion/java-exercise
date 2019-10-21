package com.slybootslion.d2;

import java.util.Arrays;

public class DemoArraysPractise {
    public static void main(String[] args) {
        String str = "jasodifjowep2930j3oowejf";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length - 1; i >= 0; i--) {
            System.out.println(chars[i]);
        }

    }
}
