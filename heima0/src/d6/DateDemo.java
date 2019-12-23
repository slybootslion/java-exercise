package d6;

import java.text.ParseException;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();
        String s = DateUtils.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s);

        String s1 = "2019-12-23 17:56:55";
        Date dd = DateUtils.stringToDate(s1, "yyyy-MM-dd HH:mm:ss");
        System.out.println(dd);

    }
}
