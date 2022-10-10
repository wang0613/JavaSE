package demo05;

import java.util.Scanner;

public class Demo01Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int classNum = 0;//班级数量
        double sum = 0.0;//总分
        double []score = new double[4];

        System.out.println("请输入班级数量：");
        classNum = input.nextInt();//输入班级个数

        for (int i = 0; i <classNum ; i++) {
            System.out.println("班级号码："+(i+1));

            for (int j = 0; j <score.length ; j++) {
                System.out.println("请输入第"+ (j+1)+"位的成绩：");
                score[j] = input.nextDouble();
                sum += score[j];
            }
            System.out.println("总分是："+ sum + ",平均分是："+ sum/score.length);
            sum = 0;
        }
    }
}
