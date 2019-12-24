package d7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("魔礼海");
        Student s2 = new Student("魔礼红");
        Student s3 = new Student("魔礼寿");
        Student s4 = new Student("魔礼青");

        List<Student> students = new ArrayList<>();

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

//        三种方式遍历集合
//        1. 迭代器
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName());
        }
        System.out.println("********");
        // for循环
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
        System.out.println("********");

        // 增强for
        for (Student student : students) {
            System.out.println(student.getName());
        }

    }
}
