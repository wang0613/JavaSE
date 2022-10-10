package demo07;
import java.util.Scanner;
/*
从键盘接收一批数字，并比较其中的最大值和最小值，输入0结束循环
while实现
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int min = 0;//最小值
        int max = 0;//最大值
        int num = 0;//输入的数字
        System.out.println("请输入一个数字：（输入0结束！！）");
        min = max = num =input.nextInt();//他们都是键盘输入
        //不是0进入循环，输入0结束！！
        while (num != 0){
            if(num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
            System.out.println("输入一个数字：（按0结束！！）");
            num = input.nextInt();//继续输入！！
        }
        System.out.println("最大值是："+ max + "最小值是：" + min);
    }

}
