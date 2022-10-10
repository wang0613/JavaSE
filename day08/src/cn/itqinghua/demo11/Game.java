package cn.itqinghua.demo11;

import javax.sound.midi.MidiFileFormat;
import java.util.Scanner;

public class Game {
    int count= 0;
    Person person = new Person();
    Computer computer = new Computer();

    public void startGame(){
        Scanner input = new Scanner(System.in);
        System.out.println("欢迎进入游戏世界");
        System.out.println("***游戏开始***");
        System.out.println("请选择对战玩家：");
        System.out.println("1:刘备 2.曹操 3.孙权");
        int choose = input.nextInt();
        switch(choose){
            case 1:
                computer.name = "刘备";
                break;
            case 2:
                computer.name= "曹操";
                break;
            case 3:
                computer.name = "孙权";
                break;
            default:
                computer.name = "无名氏";
                break;

        }
        System.out.println("您选择和"+computer.name+"对战");
        System.out.println("要开始吗？（yes/no）");
        String answer = input.next();
        while (answer.equals("yes")){
            int perFirst;
            int comFirst;
            perFirst= person.showFirst();
            comFirst= computer.showFirst();
            if ((perFirst==1&&comFirst==3)||(perFirst==2&&comFirst==1)||(perFirst==3&&comFirst==2)){
                System.out.println("………………恭喜你赢了…………");
                person.score++;
            }else if ((comFirst==1&&perFirst==3)||(comFirst==2&&perFirst==1)||(comFirst==3&&perFirst==2)){
                System.out.println("***电脑赢了**");
                computer.score++;
            }else{
                System.out.println("**平局**");
            }
            count++;//局数自增
            System.out.println("要继续吗？（yes/no）");
            answer= input.next();
        }
        showGame();


    }
    public int calcResult(){
        if (person.score > computer.score){
            return 1;
        }else if (person.score < computer.score){
            return 2;
        }else {
            return 0;
        }
    }

    public void showGame(){
        System.out.println("对战信息："+person.name +"\tVS\t" +computer.name );
        System.out.println("对战积分："+ person.score +"VS"+computer.score );
        System.out.println("对战次数："+ count);
        int result = calcResult();
        if (result==1){
            System.out.println("恭喜玩家获得胜利！！");
        }else if (result==2){
            System.out.println("电脑获得胜利！！");
        } else if (result==0){
            System.out.println("**平局！！！**");
        }

    }
}
