package com.slybootslion.d6;

import java.util.HashMap;
import java.util.Scanner;

public class DemoMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个字符串");
        String str = sc.next();

        HashMap<Character, Integer> hm = new HashMap<>();
        for (Character c :
                str.toCharArray()) {
            if(hm.containsKey(c)){
                Integer integer = hm.get(c);
                hm.put(c, integer + 1);
            }else{
                hm.put(c, 1);
            }
        }

        for (Character c :
                hm.keySet()) {
            Integer val = hm.get(c);
            System.out.println(c + "-->" + val);
        }

    }
}
