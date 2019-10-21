package com.slybootslion.d2;

import java.util.ArrayList;

public class DemoArrayListPrint {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);
        printArrayList(list);
    }

    private static void printArrayList(ArrayList<Integer> list){
        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i < list.size() - 1){
                System.out.print(list.get(i) + "@");
            }else{
                System.out.println(list.get(i) + "}");
            }
        }
    }


}
