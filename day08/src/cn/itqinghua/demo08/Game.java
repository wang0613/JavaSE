package cn.itqinghua.demo08;

import java.util.Scanner;

/*
游戏类
 */
public class Game {
    Person person = new Person();
    Computer computer = new Computer();
    int count = 0;

    public void startGame(){
        System.out.println("欢迎进入猜拳系统：");
        System.out.println("***猜拳开始：*****");
        System.out.println("请选择对战玩家：1. 曹操 2.关羽 3.刘备");
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        switch(choose){
            case 1:
                computer.name = "曹操";
                break;
            case 2:
                computer.name = "关羽";
                break;
            case 3:
                computer.name = "刘备";
                break;
            default:
                System.out.println("输入有误！！");
                break;
        }
        System.out.println("您选择了："+ computer.name );
        System.out.println("要开始吗？（yes/ no）");
        String answer = input.next();
        while(answer.equals("yes")){
            int perFirst;
            int comFirst;
            perFirst = person.showFirst();
            comFirst = computer.showFirst();

            if ((perFirst==1&&comFirst==3)||(perFirst==2&&comFirst==1)||(perFirst==3&&comFirst==2)){
                System.out.println("玩家赢下这一局");
                person.score++;
            }else if ((comFirst==1&& perFirst== 3)||(comFirst==2&&perFirst==1)||(comFirst==3&&perFirst==2)){
                System.out.println("电脑赢下这一局");
                computer.score++;
            }else {
                System.out.println("***本局平局***");
            }
            count++; //局数自增
            System.out.println("要继续吗（yes/no）");
            answer =input.next();
        }
        showResult();
    }


    public void showResult(){
        System.out.println("对战信息："+ person.name +"VS"+ computer.name);
        System.out.println("对战积分："+ person.score + "\tbi\t"+ computer.score);
        System.out.println("对战次数："+ count);
        if (person.score> computer.score){
            System.out.println("恭喜你，获得胜利！！");

        }else if (person.score < computer.score){
            System.out.println("电脑获得胜利！！");

        } else{
           System.out.println("平局");
        }

    }
}
