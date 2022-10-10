package demo06;

import java.util.Random;
import java.util.Scanner;

/*
代码模拟小游戏：
1.产生一个随机数字 Random nextInt();
2.Scanner 键盘输入
3.获取键盘输入的值
4.比较大小、
5.重试死循环
 */
public class Demo03Game {
    public static void main(String[] args) {

        Random ra = new Random();
        Scanner sc = new Scanner(System.in);
        int randomNum = ra.nextInt(100)+1;//取值范围1-100
        //randomNum记住随机数字
        while (true){
            System.out.println("输入猜的数字：");
            int guessNum = sc.nextInt();//键盘输入的中就是猜测的值
            if (guessNum > randomNum){
                System.out.println("太大了，请重试！！");
            }else if (guessNum < randomNum){
                System.out.println("太小了，请重试！！！");
            }else if (guessNum == randomNum){
                System.out.println("恭喜你，回答正确！！！");
                System.out.println("游戏结束！！！");
                break;
            }



        }

    }

}

