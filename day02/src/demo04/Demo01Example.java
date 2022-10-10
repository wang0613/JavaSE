package demo04;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
从控制台输入姓名和5科目的成绩
求总分和平均分
 */
public class Demo01Example {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        DecimalFormat de = new DecimalFormat("0.00");//格式化小数点2为
        System.out.println("请输入姓名：");
        String name = input.next();
        double sum = 0.0;//总分
        double avg = 0.0;//平均分
        for (int i = 1; i <= 5; i++){
            System.out.println("请输入第：" + i + "的成绩");
            double score = input.nextDouble();
            sum = sum + score;
            avg = sum/5;
        }
        System.out.println("总分是："+ de.format(sum) + "，平均分是："+ de.format(avg));
    }
}
