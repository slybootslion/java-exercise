package com.slybootslion.d3;

import java.util.ArrayList;

public class MainRedPacket {

    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);

        Member one = new Member("成员1", 0);
        Member two = new Member("成员2", 0);
        Member three = new Member("成员3", 0);

        manager.show();
        one.show();
        two.show();
        three.show();

        System.out.println("======================");

        ArrayList<Integer> redList = manager.send(20, 3);
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);

        manager.show();
        one.show();
        two.show();
        three.show();

    }
}
