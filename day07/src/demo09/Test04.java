package demo09;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+",班级：");

            for (int j = 0; j < 4; j++) {
                System.out.println("请输入第"+(j+1)+"位同学的成绩：");
                score = input.nextInt();
                if (score>85){
                    sum += score ;
                }
            }
        }
        System.out.println("85分以上的同学的平均分是："+ sum/4.0);
    }
}
