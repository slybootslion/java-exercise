package com.slybootslion.d2;

import java.util.ArrayList;
import java.util.Random;

public class DemoArrayListReturn {
    public static void main(String[] args) {

        ArrayList<Integer> bigList = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < 20; i++) {
            int num = r.nextInt(100) + 1;
            bigList.add(num);
        }

        ArrayList sl = getSmallList(bigList);
        System.out.println("偶数值的个数为：" + sl.size());
        System.out.println(sl);

    }

    private static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {

        ArrayList<Integer> smallList = new ArrayList<>();

        for (int i = 0; i < bigList.size(); i++) {
            if (bigList.get(i) % 2 == 0) {
                smallList.add(bigList.get(i));
            }
        }

        return smallList;
    }
}
