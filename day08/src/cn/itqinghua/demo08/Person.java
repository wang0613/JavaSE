package cn.itqinghua.demo08;

import java.util.Scanner;

/**
 * 玩家类
 */
public class Person {
    String name = "本机玩家";
    int score;

    /**
     *
     * @return 玩家出拳
     */
    public int showFirst(){
        Scanner input = new Scanner(System.in);
        System.out.println("请出拳：1.剪刀 2. 石头 3. 布（请输入对应的数字：）");
        int choose= input.nextInt();

        switch(choose){
            case 1:
                System.out.println("本机玩家出拳：剪刀");
                break;
            case 2:
                System.out.println("本机玩家出拳： 石头");
                break;
            case 3:
                System.out.println("本机玩家出拳： 布");
                break;
            default:
                System.out.println("输入有误！！");
                break;


        }
        return choose;
    }
}
