package d4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Students> arrList = new ArrayList<>();
        while (true) {
            System.out.println("----欢迎使用学生管理系统----");
            System.out.println("1. 添加学生");
            System.out.println("2. 修改学生");
            System.out.println("3. 删除学生");
            System.out.println("4. 查看全部学生");
            System.out.println("5. 退出");
            System.out.println("请选择：");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();


            switch (str) {
                case "1":
                    System.out.println("添加学生");
                    addStudent(arrList);
                    break;
                case "2":
                    System.out.println("修改学生");
                    editStudent(arrList);
                    break;
                case "3":
                    System.out.println("删除学生");
                    delStudent(arrList);
                    break;
                case "4":
                    System.out.println("查看全部学生");
                    showStudent(arrList);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    System.exit(0);
                default:
                    System.out.println("输入有误，重新选择");
            }
        }
    }

    private static void addStudent(ArrayList<Students> arr) {

        Scanner sc = new Scanner(System.in);

        String num;
        while (true) {
            System.out.println("输入学号：");
            num = sc.nextLine();
            if (isUsed(arr, num)) {
                break;
            }
        }
        System.out.println("输入姓名：");
        String name = sc.nextLine();
        System.out.println("输入年龄：");
        String age = sc.nextLine();
        System.out.println("输入居住地：");
        String address = sc.nextLine();
        Students stu = new Students(num, name, age, address);
        arr.add(stu);

        System.out.println("录入成功");
    }

    private static void editStudent(ArrayList<Students> arr) {
        showStudent(arr);
        System.out.println("输入要修改的学生学号：");
        Scanner sc = new Scanner(System.in);

        String sid = sc.nextLine();
        for (int i = 0; i < arr.size(); i++) {
            Students s = arr.get(i);
            if (s.getSid().equals(sid)) {
                System.out.println("输入新的学生姓名：");
                String name = sc.nextLine();
                System.out.println("输入新的学生年龄：");
                String age = sc.nextLine();
                System.out.println("输入新的学生地址：");
                String address = sc.nextLine();
                Students stu = new Students(sid, name, age, address);
                arr.set(i, stu);
                System.out.println("修改学生信息成功");
                return;
            }
        }

        System.out.println("没找到该学生信息，无法修改");
    }

    private static void delStudent(ArrayList<Students> arr) {
        showStudent(arr);
        System.out.println("输入要删除的学生学号：");

        Scanner sc = new Scanner(System.in);

        String sid = sc.nextLine();

        for (int i = 0; i < arr.size(); i++) {
            Students stu = arr.get(i);
            if (stu.getSid().equals(sid)) {
                arr.remove(i);
                System.out.println("删除学生成功");
                return;
            }
        }

        System.out.println("没有找到该学生");

    }

    private static void showStudent(ArrayList<Students> arr) {

        if (arr.size() < 1) {
            System.out.println("没有学生信息，请先添加！");
            return;
        }

        for (int i = 0; i < arr.size(); i++) {
            Students stu = arr.get(i);
            String sid = stu.getSid();
            String name = stu.getName();
            String age = stu.getAge();
            String address = stu.getAddress();
            System.out.println("学号：" + sid + "，姓名：" + name + "，年龄：" + age + "居住地：" + address);
        }
    }

    private static Boolean isUsed(ArrayList<Students> arr, String uid) {
        for (int i = 0; i < arr.size(); i++) {
            Students stu = arr.get(i);
            if (stu.getSid().equals(uid)) {
                System.out.println("学生学号重复！");
                return false;
            }
        }
        return true;
    }
}
