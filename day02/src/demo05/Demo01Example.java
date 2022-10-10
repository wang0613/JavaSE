package demo05;
import java.util.Scanner;
/*
创建购买系统
 */
public class Demo01Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("开始购买吗？");
        System.out.println("**yes 进入系统，按任意键退出！！！***");
        String name = input.next();
        int choose = 0;//选择项先为0
        double price = 0.0;//价格
        //输入yes进入系统
        while (name.equals("yes")){
            System.out.println("开始购物！！");
            System.out.println("1.乒乓球 2.足球 3.篮球");
            System.out.println("按0退出");
            choose = input.nextInt();//选择物品，输入0退出
            if (choose == 0){
                break;
            }
            switch (choose){
                case 1:
                    name ="1.乒乓球";
                    price = 320;
                    break;
                case 2:
                    name = "2.足球";
                    price = 230;
                    break;
                case 3:
                    name = "3.篮球";
                    price = 600;
                    break;
                default:
                    System.out.println("输入错误！！！！");
                    break;
            }
            System.out.println("我买了："+ name + "价格为："+ price);
            System.out.println("欢迎下次光临！！！！！！！！！");

        }


    }
}
