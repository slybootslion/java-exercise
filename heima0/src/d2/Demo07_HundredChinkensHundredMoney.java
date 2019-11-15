package d2;

public class Demo07_HundredChinkensHundredMoney {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i++) {
            for (int j = 0; j <= 33; j++) {
                int k = 100 - i - j;
                if (k % 3 == 0 && k / 3 + j * 3 + i * 5 == 100) {
                    System.out.println("公鸡：" + i + "，母鸡：" + j + "，小鸡：" + k);
                }
            }
        }
    }
}
