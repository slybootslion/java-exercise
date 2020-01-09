package d11;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        String s = "林青霞，30";
        convent(s, s1 -> s.split("，")[1], Integer::parseInt, integer -> integer + 70);
    }

    private static void convent(String s, Function<String, String> f1,
                                Function<String, Integer> f2, Function<Integer, Integer> f3) {
        Integer num = f1.andThen(f2).andThen(f3).apply(s);
        System.out.println(num);
    }
}
