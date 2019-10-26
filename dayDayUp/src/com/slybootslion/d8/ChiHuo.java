package com.slybootslion.d8;

public class ChiHuo extends Thread {
    private BaoZi bz;

    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                System.out.println("吃货正在吃" + bz.pi + bz.xian + "的包子");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                bz.flag = false;
                bz.notify();
                System.out.println(bz.pi + bz.xian + "已吃完");
                System.out.println("========================");
            }
        }
    }
}
