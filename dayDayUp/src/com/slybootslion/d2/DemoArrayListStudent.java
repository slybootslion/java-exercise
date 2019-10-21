package com.slybootslion.d2;

import java.util.ArrayList;

public class DemoArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("刘德华", 20);
        Student stu2 = new Student("张学友", 21);
        Student stu3 = new Student("郭富城", 22);
        Student stu4 = new Student("黎明", 23);


        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("学生姓名：" + stu.getName() + "，学生年龄：" + stu.getAge());
        }
    }
}
