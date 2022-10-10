package cn.itqinghua.demo05;

import java.util.Scanner;

public class Demo01Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StudentBiz stu = new StudentBiz();
        int []scores = new int[5];

        System.out.println("请输入分数：");
        for (int i = 0; i < scores.length; i++) {
            scores[i]= input.nextInt();
        }

        double sum = stu.calcSum(scores);
        double avg = stu.calcAvg(scores);
        System.out.println(sum);
        System.out.println(avg);
        double max = stu.calcMax(scores);
        double min = stu.calcMin(scores);
        System.out.println("最大值："+ max);
        System.out.println("最小值为："+ min);
    }
}
