package demo06;

import java.util.Scanner;

/*
题目：
键盘输入int数字，然后求出其中的最大值
先判断前两个其中谁大，拿出max和下一个数比较
 */
public class Demo04Scanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int a = input.nextInt();

        System.out.println("请输入第二个数字：");
        int b = input.nextInt();

        System.out.println("请输入第三个数字：");
        int c = input.nextInt();
        int temp = a > b ? a:b;
        int max = temp > c ? temp:c;
        /*if语句也可以，推荐三元运算符
        int temp = a;
        int max;
        if (a > b ){
            temp = a;
        }else {
            temp = b;
        }
        if (temp > c){
            max = temp;
        }else {
            max = c;
        }    */
        System.out.println("最大数是："+ max);
    }
}
