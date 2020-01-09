package d11;

import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        String[] strArr = {"林青霞，30", "张曼玉，35", "王祖贤，33",};

        printInfo(strArr, s -> {
            String s1 = s.split("，")[0];
            System.out.print("姓名：" + s1);
        }, s -> {
            int i2 = Integer.parseInt(s.split("，")[1]);
            System.out.println("，年龄：" + i2);
        });
    }

    private static void printInfo(String[] arr, Consumer<String> c1, Consumer<String> c2) {
        for (String s : arr) {
            c1.andThen(c2).accept(s);
        }
    }
}
