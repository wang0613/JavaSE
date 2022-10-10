package cn.itqinghua.demo11;

import java.util.Scanner;

public class Person {
    String name;
    int score;

    public int showFirst() {
        Scanner input = new Scanner(System.in);
        System.out.println("请出拳：（1：剪刀 2.石头 3.布）");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                System.out.println("你出拳：剪刀");
                break;
            case 2:
                System.out.println("你出拳：石头");
                break;
            case 3:
                System.out.println("你出拳：布");
                break;
            default:
                System.out.println("输入有误！！");
                break;

        }
        return choose;
    }
}
