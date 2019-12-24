package d7;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Student s1 = new Student("魔礼海");
        Student s2 = new Student("魔礼红");
        Student s3 = new Student("魔礼寿");
        Student s4 = new Student("魔礼青");
        Student s5 = new Student("魔礼青");

        HashMap<Student, String> hm = new HashMap<>();

        hm.put(s1, "东方");
        hm.put(s2, "北方");
        hm.put(s3, "西方");
        hm.put(s4, "南方");
        hm.put(s5, "不知道");

        Set<Student> students = hm.keySet();

        for (Student student : students) {
            String val = hm.get(student);
            String name = student.getName();
            System.out.println(name + "居住地：" + val);
        }
    }
}
