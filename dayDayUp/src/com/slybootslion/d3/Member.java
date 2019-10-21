package com.slybootslion.d3;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }

    public void receive(ArrayList<Integer> redList){
        int idx = new Random().nextInt(redList.size());

        int delta = redList.remove(idx);
        int money = getMoney();
        setMoney(money + delta);
    }
}
