package demo03;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        int liSi = 80;//李四的成绩为80
        boolean isBig;//先声明一个布尔类型的变量

        Scanner input = new Scanner(System.in);
        //Scanner键盘输入一个数字
        System.out.println("输入学员张三的成绩：");

        int zhangS = input.nextInt();//input输入成绩
        isBig = zhangS > liSi; //比较结果存放在布尔类型的变量
        System.out.println("张三的成绩比李四高吗？"+ isBig);
    }
}
