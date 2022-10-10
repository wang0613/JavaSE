package demo07;

import java.util.Scanner;

/*
循环录入五门课的成绩，并计算平均分，如果为负数，则跳出循环，提示录入错误
 */
public class Test04Break {
    public static void main(String[] args) {
        int score = 0;
        int sum = 0;
        double avg = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("输入学生姓名：");
        String name = input.next();
        for (int i = 0; i< 5;i++){
            System.out.println("请输入第" + (i+1)+"的成绩！");
            score = input.nextInt();//输入成绩
            if (score <0){
                System.out.println("输入错误！！");
                break;
            }
            sum = sum + score;//无意外正常累加！
            avg= (double)sum /5;
            System.out.println("平均分是：" +avg);
            System.out.println("总分是：" + sum);
        }
    }
}
