package demo04;

import java.util.Scanner;

/*
键盘输入摄氏度，
打印华氏度
 */
public class Demo02Example {
    public static void main(String[] args) {
        System.out.println("请输入摄氏度：");
        Scanner input= new Scanner(System.in);
        double temper = 0.0;//摄氏度
        temper = input.nextDouble();
        double result = 0.0;//结果：华氏度
        int i = 1;
        do {
            result = temper * 9/ 5.0 + 32;
            System.out.println("第" +i+"摄氏度："+ temper + ",华氏度："+ result);
            temper = temper+ 20;
            i++;
        } while(i <= 5 && result <= 500);

    }
}
