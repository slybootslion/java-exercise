package d9;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetToFileDemo {
    public static void main(String[] args) throws IOException {
        // 创建TreeSet集合
        TreeSet<Student> ts = new TreeSet<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num = s2.sum() - s1.sum();
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;
                int num3 = num2 == 0 ? s1.getMath() - s2.getMath() : num2;
                int num4 = num3 == 0 ? s1.getName().compareTo(s2.getName()) : num3;
                return num4;
            }
        });

        // 键盘录入学生信息
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("输入第" + (i + 1) + "个学生信息");
            System.out.println("姓名：");
            String name = sc.nextLine();
            System.out.println("语文成绩");
            int chinese = sc.nextInt();
            System.out.println("数学成绩");
            int math = sc.nextInt();
            System.out.println("英语成绩");
            int english = sc.nextInt();

            // 创建学生对象，把信息赋值给学生对象
            Student student = new Student();
            student.setName(name);
            student.setChinese(chinese);
            student.setMath(math);
            student.setEnglish(english);

            ts.add(student);
        }

        // 创建字符缓冲流输入对象
        BufferedWriter bw = new BufferedWriter(new FileWriter("fileTest/dirTwo/student.txt"));

        // 遍历集合 得到学生对象 按照指定格式拼接字符串
        for (Student student : ts) {
            StringBuilder sb = new StringBuilder();
            sb.append(student.getName()).append("，").append(student.getChinese()).append("，").append(student.getMath()).append("，").append(student.getEnglish()).append("，总分：").append(student.sum());

            // 写入数据
            bw.write(sb.toString());
            bw.newLine();
            bw.flush();
        }

        // 释放资源
        bw.close();
    }


}
