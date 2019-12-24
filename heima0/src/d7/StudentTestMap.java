package d7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StudentTestMap {
    public static void main(String[] args) {
        Student s1 = new Student("魔礼海");
        Student s2 = new Student("魔礼红");
        Student s3 = new Student("魔礼寿");
        Student s4 = new Student("魔礼青");

        HashMap<String, Student> studentMap = new HashMap<>();

        studentMap.put("001", s1);
        studentMap.put("002", s2);
        studentMap.put("003", s3);
        studentMap.put("004", s4);

        // 遍历，方式1：
        Set<String> keys = studentMap.keySet();
        for (String key : keys) {
            System.out.println(key + "->" + studentMap.get(key).getName());
        }

        System.out.println("********");

        // 遍历，方式2：
        Set<Map.Entry<String, Student>> keyEs = studentMap.entrySet();
        for (Map.Entry<String, Student> keyE : keyEs) {
            String key = keyE.getKey();
            Student value = keyE.getValue();
            System.out.println(key + "->" + value.getName());
        }

    }
}
