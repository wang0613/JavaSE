package demo10;

import java.util.Scanner;

/*
用户进入游戏平台：
选择进入游戏：
1.斗地主
2.斗牛
3.泡泡龙
4.连连看
 */
public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("欢迎进入青鸟迷你游戏平台："+ "\n");
        System.out.println("选择您喜欢的游戏："+ "\n");
        System.out.println("*************************************");
        System.out.println("1.斗地主");
        System.out.println("2.斗牛");
        System.out.println("3.泡泡龙");
        System.out.println("4.连连看");
        System.out.println("************************************"+"\n");
        System.out.println("请选择，输入数字：");
        int choose = input.nextInt();
        switch (choose){
            case 1:
                System.out.println("您已进入斗地主房间！");
                break;
            case 2:
                System.out.println("您已进入斗牛房间！");
                break;
            case 3:
                System.out.println("您已进入泡泡龙房间！");
                break;
            case 4:
                System.out.println("您已进入连连看房间！");
                break;
            default:
                System.out.println("输入错误！！");

        }
    }
}
