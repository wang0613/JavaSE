package demo08;

import java.util.Scanner;

/*
循环录入三位会员信息（会员号，会员生日，积分）
 */
public class Demo03AddCustomer {
    public static void main(String[] args) {
        System.out.println("请输入客户信息：\n");
        String birthday = "";//生日
        int cusNO = 0;//会员号
        int points =0;//积分
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.println("请输入会员卡号：（四位整数）");
            cusNO = input.nextInt();
            System.out.println("请输入会员生日：");
            birthday = input.next();
            System.out.println("请输入会员积分：");
            points = input.nextInt();
            //判断一下
            if (cusNO > 9999 || cusNO < 1000){
                System.out.println("客户号" + cusNO + "是无效会员号！！");
                System.out.println("录入信息失败哦！！");
                continue;
            }
            System.out.println("你录入的信息为：" );
            System.out.println(cusNO + "\t"+ birthday +"\t"+ points);
            break;
        }
        System.out.println("程序结束！！！！！");
    }
}
