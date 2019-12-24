package d7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();

        Student s1 = new Student("linqingxia", 30);
        Student s2 = new Student("zhangmanyu", 35);
        Student s3 = new Student("wangzuxian", 33);
        Student s4 = new Student("liuyan", 33);

        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);

        // 使用Collections对ArrayList进行排序
        Collections.sort(al, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int num = o1.getAge() - o2.getAge();
                int num2 = num == 0 ? o1.getName().compareTo(o2.getName()) : num;
                return num2;
            }
        });

        for (Student student : al) {
            System.out.println(student.getName() + ", " + student.getAge());
        }
    }
}
