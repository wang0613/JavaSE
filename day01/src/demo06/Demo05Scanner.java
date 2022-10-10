package demo06;

import java.util.Scanner;

/*
题目：
键盘输入三个数字：
并求和
 */
public class Demo05Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = input.nextInt();

        System.out.println("请输入第二个数字：");
        int num2 = input.nextInt();

        System.out.println("请输入第三个数字：");
        int num3 = input.nextInt();

        int result = num1 + num2 +num3;
        System.out.println("结果是："+ result);

    }

}
