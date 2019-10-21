package com.slybootslion.d1;

/*
* 定义一个标准的类 Java bean
* 全部成员变量私有
* 无参构造函数 全参构造函数 所有成员变量的getter/setter
* */

public class Student {

    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
