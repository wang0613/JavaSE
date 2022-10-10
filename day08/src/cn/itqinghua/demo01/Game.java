package cn.itqinghua.demo01;
import java.util.Scanner;

/**
 * 游戏类
 */
public class Game {

    Person person = new Person();
    Computer computer = new Computer();
    int count=0;//对战次数

    /**
     * 游戏开始的方法
     */
    public void startGame() {
        System.out.println("********************");
        System.out.println("********猜拳开始：**");
        System.out.println("请选择电脑玩家：");
        System.out.println("1.刘备 2.关羽 3.司马懿");
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                computer.name= "刘备";
                break;
            case 2:
                computer.name = "关羽";
                break;
            case 3:
                computer.name = "司马懿";
                break;
            default:
                computer.name = "无名氏";
                break;
        }
        System.out.println("您选择的对战玩家："+ computer.name);
        System.out.println("要开始吗?(yes/no)");
        String answer= "";
        answer = input.next();
        while (answer.equals("yes")){
            int perFirst;//接收玩家出的拳
            int comFirst;//接收电脑出的拳
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

        showResult();//调用展示结果的方法
    }

    /**
     * 计算结果的一个方法
     * @return获胜的一个数字，int
     */
    public int calcResult(){
        if (person.score> computer.score){
            return 1;//返回1用showResult接收
        }else if (person.score < computer.score){
            return 2;
        }else{
            System.out.println("平局");
            return 0;
        }
    }

    /**
     * 在展示结果类调用calcResult的方法，接收返回值
     */
    public void showResult(){
        System.out.println("--------------------");
        System.out.println(person.name+"VS"+computer.name);
        System.out.println("玩家积分："+ person.score + computer.name+"的积分："+ computer.score);
        System.out.println("对战次数："+ count);
        int calcResult = calcResult();
        if (calcResult==1){
            System.out.println("恭喜你获得胜利！");
        }else if (calcResult==2){
            System.out.println("你输了，加油呀！");
        }else{
            System.out.println("平局继续加油！！");
        }
    }
}
