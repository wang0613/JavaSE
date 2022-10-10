package cn.itqinghua.demo01;
import java.util.Scanner;
/**
 *用户类
 */
public class Person {
    String name = "帅哥哥";
    int score;

    /**
     * @return玩家出拳int
     */
    public int showFirst(){
        Scanner input = new Scanner(System.in);
        System.out.println("请玩家出拳：1.剪刀2.石头3.布（请输入具体数字：）");
        int choose = input.nextInt();
        switch(choose){
            case 1:
                System.out.println("您出拳：剪刀");
                break;
            case 2:
                System.out.println("您出拳：石头");
                break;
            case 3:
                System.out.println("您出拳：布");
                break;
            default:
                break;
        }
        return choose;
    }
}
