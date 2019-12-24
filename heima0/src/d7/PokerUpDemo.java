package d7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerUpDemo {
    public static void main(String[] args) {
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] jockers = {"LittleJocker", "BigJocker"};

        HashMap<Integer, String> hm = new HashMap<>();

        ArrayList<Integer> al = new ArrayList<>();

        int index = 0;

        for (String number : numbers) {
            for (String color : colors) {
                hm.put(index, color + number);
                al.add(index);
                index++;
            }
        }

        for (String jocker : jockers) {
            hm.put(index, jocker);
            al.add(index);
            index++;
        }

        Collections.shuffle(al);

        TreeSet<Integer> lqxSet = new TreeSet<>();
        TreeSet<Integer> lySet = new TreeSet<>();
        TreeSet<Integer> fqySet = new TreeSet<>();
        TreeSet<Integer> dipaiSet = new TreeSet<>();


        for (int i = 0; i < al.size(); i++) {
            Integer idx = al.get(i);
            if (i >= al.size() - 3) {
                dipaiSet.add(idx);
            } else {
                if (i % 3 == 0) {
                    lqxSet.add(idx);
                } else if (i % 3 == 1) {
                    lySet.add(idx);
                } else if (i % 3 == 2) {
                    fqySet.add(idx);
                }
            }
        }

        // 看牌
        lookPoker("林青霞", lqxSet, hm);
        lookPoker("刘岩", lySet, hm);
        lookPoker("风清扬", fqySet, hm);
        lookPoker("底牌", dipaiSet, hm);

    }

    private static void lookPoker(String name, TreeSet<Integer> ts, HashMap<Integer, String> hm) {
        System.out.print(name + "的牌是");
        for (Integer t : ts) {
            String poker = hm.get(t);
            System.out.print(poker + ", ");
        }
        System.out.println();
    }
}
