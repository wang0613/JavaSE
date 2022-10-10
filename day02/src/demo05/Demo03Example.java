package demo05;

import java.util.Scanner;

/*
从键盘输入整数1-7，显示日期
 */
public class Demo03Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入0-7的数字，按o结束！");
        int num = input.nextInt();
        //输入0退出
        while (num != 0) {
            switch (num) {
                case 1:
                    System.out.println("今天是：MON");
                    break;
                case 2:
                    System.out.println("今天是：TUE");
                    break;
                case 3:
                    System.out.println("今天是：WED");
                    break;
                case 4:
                    System.out.println("今天是：THU");
                    break;
                case 5:
                    System.out.println("今天是：FRI");
                    break;
                case 6:
                    System.out.println("今天是：SAT");
                    break;
                case 7:
                    System.out.println("今天是：SUN");
                    break;
                default:
                    System.out.println("输入有误！！");
            }
            System.out.println("程序结束！！！！！！！！！！！！！！");
            break;
        }
        if (num == 0) {
            System.out.println("程序结束！！！！！");
        }


    }
}
