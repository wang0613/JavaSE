package demo04;

import java.util.Scanner;

//键盘输入行数打印dao直角三角形
public class Demo03Print {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int line = 0;
        System.out.println("请输入行数：");
        line = input.nextInt();

        for (int i = line; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
