package d7;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入查找的年份");
        int year = sc.nextInt();

        // 日历类
        Calendar c = Calendar.getInstance();
        c.set(year, 2, 1);
        c.add(Calendar.DATE, -1);

        int date = c.get(Calendar.DATE);

        System.out.println(year + "年2月有" + date + "天");

    }
}
