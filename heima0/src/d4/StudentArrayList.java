package d4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArrayList {
    public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            createStudent(arr);
        }

        for (int i = 0; i < arr.size(); i++) {
            String n = arr.get(i).getName();
            int a = arr.get(i).getAge();

            System.out.println("学生姓名：" + n + "，学生年龄：" + a);
        }


    }

    private static void createStudent(ArrayList<Student> arr) {
        Scanner sc = new Scanner(System.in);

        System.out.println("输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("输入学生年龄：");
        int age = sc.nextInt();


        Student student = new Student();
        student.setName(name);
        student.setAge(age);

        arr.add(student);
    }
}
