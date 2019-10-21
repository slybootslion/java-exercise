package com.slybootslion.d5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class DouDiZhu {
    public static void main(String[] args) {
        ArrayList<String> poker = new ArrayList<>();

        String[] colors = {"♠", "♣", "♥", "♦"};
        String[] numbers = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};

        poker.add("大王");
        poker.add("小王");

        for (String number : numbers) {
            for (String color : colors) {
                poker.add(color + number);
            }
        }

//        洗牌
        Collections.shuffle(poker);
//        发牌
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);
            if (i >= 51) {
                dipai.add(p);
            } else if (i % 3 == 0) {
                p1.add(p);
            } else if (i % 3 == 1) {
                p2.add(p);
            } else {
                p3.add(p);
            }
        }
// 亮牌
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(dipai);

    }
}
