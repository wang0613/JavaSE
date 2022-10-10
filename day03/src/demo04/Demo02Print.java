package demo04;
/*
键盘输入行数打印直角三角形
 */
import java.util.Scanner;

public class Demo02Print {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int line = 0;
        System.out.println("请输入行数：");
        line = input.nextInt();
        for (int i = 0; i < line; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
