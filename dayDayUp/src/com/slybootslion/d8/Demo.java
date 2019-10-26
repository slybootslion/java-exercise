package com.slybootslion.d8;

public class Demo {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        new BaiZiPu(bz).start();
        new ChiHuo(bz).start();
    }
}
