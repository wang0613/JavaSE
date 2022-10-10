package demo10;
/*
用户玩游戏：每次玩五局，晋级规则如下：
5局游戏，如果80% 达到80分以上，则为一级，60% 达到 80分以上，则为二级，否则不晋级
 */
import java.util.Scanner;
public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("青鸟游戏平台  > 游戏晋级");
        int n = 1;//第一句开始
        int score = 0;//得分
        int count = 0;//计数器
        String answer = "";
        double rate = count / 5.0;//计算80分以上的比列
        do {
            System.out.println("您正在玩"+n +"句游戏，得分：");
            score = input.nextInt();
            if (score > 80){
                count ++;
            }
            n++;//局数自增
            if (n > 5 ){
                System.out.println("游戏结束！！");
                if (rate > 0.8){
                    System.out.println("恭喜！通过一级！！");
                } else if (rate > 0.6){
                    System.out.println("恭喜！通过二级！");
                }else{
                    System.out.println("未能晋级！！");
                }
            }else {
                System.out.println("继续下一句吗？（yes / no）");
                answer = input.next();
            }
            if (answer.equals("no")){
                System.out.println("您已中途退出游戏！！");
                break;
            }else {
                System.out.println("进入下一句");
            }
        } while ( n <= 5);

    }
}
