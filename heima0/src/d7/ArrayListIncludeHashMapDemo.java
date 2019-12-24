package d7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListIncludeHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, String>> arrs = new ArrayList<>();

        HashMap<String, String> hm1 = new HashMap<>();
        hm1.put("孙策", "大乔");
        hm1.put("周瑜", "小乔");
        arrs.add(hm1);

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("郭靖", "黄蓉");
        hm2.put("杨过", "小龙女");
        arrs.add(hm2);

        HashMap<String, String> hm3 = new HashMap<>();
        hm3.put("令狐冲", "任盈盈");
        hm3.put("林平之", "岳灵珊");
        arrs.add(hm3);

        for (HashMap<String, String> item : arrs) {
            Set<String> keys = item.keySet();
            for (String key : keys) {
                String val = item.get(key);
                System.out.println(key + " -> " + val);
            }
        }


    }
}
