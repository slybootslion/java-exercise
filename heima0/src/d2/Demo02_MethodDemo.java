package d2;

import java.util.Scanner;

public class Demo02_MethodDemo {
    public static void main(String[] args) {
        System.out.println("输入一个整数，判断是否为偶数：");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flag = isEvenNum(num);
        System.out.println(flag);
    }

    private static boolean isEvenNum(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
