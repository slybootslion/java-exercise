package d1;

public class lilyNum {
    public static void main(String[] args) {
        int c = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            if (Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3) == i) {
                System.out.println(i);
                c += 1;
            }
        }
        System.out.println("水仙花个数一共" + c + "个");
    }
}
