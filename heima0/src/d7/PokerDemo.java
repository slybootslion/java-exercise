package d7;

import java.util.ArrayList;
import java.util.Collections;

public class PokerDemo {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();

        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] numbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] jockers = {"LittleJocker", "BigJocker"};

        for (String color : colors) {
            for (String number : numbers) {
                al.add(color + number);
            }
        }

        al.add(jockers[0]);
        al.add(jockers[1]);

        // 洗牌
        Collections.shuffle(al);

        // 发牌

        ArrayList<String> lqx = new ArrayList<>();
        ArrayList<String> ly = new ArrayList<>();
        ArrayList<String> fqy = new ArrayList<>();
        ArrayList<String> dipai = new ArrayList<>();

        for (int i = 0; i < al.size(); i++) {
            String poker = al.get(i);
            if (i >= al.size() - 3) {
                dipai.add(poker);
            } else {
                if (i % 3 == 0) {
                    lqx.add(poker);
                } else if (i % 3 == 1) {
                    ly.add(poker);
                } else if (i % 3 == 2) {
                    fqy.add(poker);
                }
            }
        }

        // 看牌
        lookPock("林青霞", lqx);
        lookPock("刘岩", ly);
        lookPock("风清扬", fqy);
        lookPock("底牌", dipai);

    }

    private static void lookPock(String name, ArrayList pokerList) {
        System.out.print(name + "的牌是：");
        for (Object o : pokerList) {
            System.out.print(o + ", ");
        }
        System.out.println();
    }
}
