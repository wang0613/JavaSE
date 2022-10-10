package demo07;

import java.util.Scanner;

/*
从键盘接收一批数字，并比较其中的最大值和最小值，输入0结束循环
do while实现
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max = 0,min = 0, num = 0;
        do {
            System.out.println("输入一个整数：（输入0结束！！）");
            num = input.nextInt();
            if (num > max){
                max = num;
            }
            //如果min等于0或者 num 小于min 并且 num不等于0
            if (min ==0 ||num < min && num!=0 ){
                min = num;
            }
        }while (num != 0);


        System.out.println("最大值是："+ max + "最小值是：" + min);
    }
}
