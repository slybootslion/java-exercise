package d2;

public class Demo05_PassSeven {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i / 10 % 10 == 7 || i % 10 == 7 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}
