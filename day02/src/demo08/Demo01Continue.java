package demo08;

import java.util.Scanner;

/*
continue语句练习：
键盘输入五位学生成绩，计算80分以上所占的比列：
思路：
成绩score Scanner for count计数器
 */
public class Demo01Continue {
    public static void main(String[] args) {
        int score = 0;//成绩
        int count = 0;//计数器
        int total = 0;//全部人数
        Scanner input = new Scanner(System.in);
        System.out.println("请输入班级总人数：");
        total = input.nextInt();//多少人循环多少次。
        for (int i = 0; i < total; i++) {
            System.out.println("请输入第" + (i + 1) + "位的成绩！");
            score = input.nextInt();
            // if (score > 80){
            //   count++;
            // }
            if (score < 80){
                continue;
            }
            count++;//同样效果！
        }
        double rate = (double)count/total *100;
        System.out.println("80分以上的人数有：" + count);
        System.out.println("80分以上的人数所占的比例有：" + rate);
    }
}
