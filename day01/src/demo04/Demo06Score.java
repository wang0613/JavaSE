package demo04;
/*
键盘输入打印 张 王 李 三人的成绩
算出平均分
总分
分数差
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Demo06Score {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        //强制保留两位小数点DecimalFormat 导包

        double z = 0.0, w = 0.0, l = 0.0;
        Scanner input = new Scanner(System.in);
        System.out.println("请输入张三的成绩：");
        z = input.nextDouble();

        System.out.println("请输入王哥的成绩：");
        w = input.nextDouble();

        System.out.println("请输入李四的成绩：");
        l = input.nextDouble();
        System.out.println("********************************");

        System.out.println("张三    王哥   李四");
        System.out.println( z + "\t" + w + "\t"+ l );
        System.out.println("-----------------------------");

        double sum = z + w + l;//sum总分
        double avg = sum / 3;//avg 平均分
        boolean falg = z > w;//张三的分数比王哥高吗？

        System.out.println("三人的总分是：" + df.format(sum));
        System.out.println("三人的屏平均分是：" + df.format(avg));
        System.out.println("张三的分数比李四高？" + falg);
        //df.format();方法调用。保留两位小数点，
    }
}
