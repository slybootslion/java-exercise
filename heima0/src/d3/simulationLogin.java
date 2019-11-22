package d3;

import java.util.Scanner;

public class simulationLogin {
    public static void main(String[] args) {
        String username = "slybootslion";
        String password = "123456";

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("输入用户名：");
            String name = sc.nextLine();
            System.out.println("输入密码：");
            String pwd = sc.nextLine();
            if (pwd.equals(password) && name.equals(username)) {
                System.out.println("登录成功");
                break;
            } else {
                if(2-i == 0) {
                    System.out.println("账户被锁定，联系管理员");
                }else {
                    System.out.println("用户名密码错误，还有" + (2 - i) + "次机会");
                }
            }
        }
    }
}
