package demo06;
/*
键盘输入一个四位数字：
拿出十位来和随机数字相比较正确表示幸运用户
 */

import java.util.Scanner;

public class Demo01Random {
    public static void main(String[] args) {
        System.out.println("请输入一个四位数数字：");
        Scanner input = new Scanner(System.in);
        int luckNum = 0;
        luckNum = input.nextInt();

        int text = luckNum /100%10;//拿出百位
        int num = (int)(Math.random()*10);
        //Math.random是指随机系统选取大于0.0小于1.0之间的伪Double值，*10变成整数int
        System.out.println("幸运数字是：" + text + "，随机数字是："+ num);

        if (text == num){
            System.out.println("恭喜你，中奖了！！！！！");
        }else {
            System.out.println("再接再厉！！");
        }





    }




}
