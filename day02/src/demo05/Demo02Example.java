package demo05;

import java.util.Scanner;

/*
My shopping 管理系统
1，T恤 2，网球鞋 3，网球拍
 double price
 String name
 */
public class Demo02Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = "";//初始化名字
        double price = 0.0;//商品价格
        int no = 0;//商品编号
        System.out.println("*****************");
        System.out.println("MY shopping 购物系统,yes 开始  > 结算 n0");
        System.out.println("************************");
        name = input.next();//输入yes开始
        while (name.equals("yes")){
            System.out.println("请输入商品编号：");
            System.out.println("请输入购买的商品编号");
            System.out.println("1，T恤 2，网球鞋 3，网球拍");
            no = input.nextInt();//商品编号
            switch(no){
                case 1:
                    name = "1，T恤";
                    price = 268.9;
                    break;
                case 2:
                    name = "2.网球鞋";
                    price = 369.5;
                    break;
                case 3:
                    name = "3.网球拍";
                    price = 236.8;
                    break;
                default:
                    System.out.println("输入有误！！");
                    break;
            }
            System.out.println("选择了：" + name + ",价格为：" + price);
            System.out.println("是否继续： yes /no");
            name = input.next();//是否继续
            //如果输入no结束程序！！！
            if (name.equals("no")){
                System.out.println("程序结束！！！");
                break;
            }
        }

    }
}
