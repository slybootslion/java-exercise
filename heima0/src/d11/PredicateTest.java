package d11;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        String[] strArr = {"林青霞，30", "柳岩，34", "张曼玉，35", "貂蝉，31", "王祖贤，33"};

        ArrayList<String> al = myFilter(strArr, s -> s.split("，")[0].length() > 2, s -> Integer.parseInt(s.split("，")[1]) > 33);

        for (String s : al) {
            System.out.println(s);
        }

    }

    private static ArrayList<String> myFilter(String[] strArr, Predicate<String> p1,
                                              Predicate<String> p2) {
        // 定义集合
        ArrayList<String> arrayList = new ArrayList<String>();

        // 遍历
        for (String s : strArr) {
            if (p1.and(p2).test(s)) {
                arrayList.add(s);
            }
        }

        return arrayList;
    }
}
