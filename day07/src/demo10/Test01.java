package demo10;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String user = "";//用户名
        int  pass = 0; //密码
        String use;//登录用户名
        int pad;//登录密码
        int myCard;//我的卡号
        int max = 9999;
        int min = 1000;
        int cardNumber = (int )(Math.random()*(max-min))+min;
        int []array= new int[5];

        while(true){
            System.out.println("***欢迎进入富奖系统*****");
            System.out.println("\t\t\t1.注册");
            System.out.println("\t\t\t2.登录");
            System.out.println("\t\t\t3.抽奖");
            System.out.println("*************************");
            System.out.println("请选择菜单：");
            int choose = input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("[系统 》注册]");
                    System.out.println("先写个人信息：");
                    System.out.println("请输入用户名：");
                    user = input.next();
                    System.out.println("请输入密码：");
                    pass = input.nextInt();
                    System.out.println("注册成功，请牢记您的会员卡号：");
                    System.out.println("用户名\t\t\t密码\t\t\t会员卡号" );
                    System.out.println(user+"\t\t"+ pass+"\t\t\t"+ cardNumber);
                    break;
                case 2:
                    System.out.println("[系统 》登录]");
                    System.out.println("请输入用户名：");
                    use = input.next();
                    System.out.println("请输入密码：");
                    pad = input.nextInt();
                    if (use.equals(user) && pad == pass){
                        System.out.println("欢迎您："+ use);
                    }else {
                        System.out.println("用户名或密码错误");
                    }
                    break;
                case 3:
                    System.out.println("[系统 》抽奖");
                    System.out.println("请输入您的卡号：");
                    myCard = input.nextInt();
                    for (int i = 0; i < array.length; i++) {
                        array[i] = (int )(Math.random()*(max-min))+min;
                    }
                    System.out.println("本周的幸运数字是：");
                    for (int i = 0; i < array.length; i++) {
                        System.out.println(array[i]);
                        if (array[i] == myCard){
                            System.out.println("恭喜中奖！！");
                        }else {
                            System.out.println("未中奖！");
                        }
                    }

                    break;
                default:
                    System.out.println("输入有误！！");
            }
            System.out.println("要继续吗？（Yes/no）");
            String answer = input.next();
            if (answer.equals("no")){
                System.out.println("系统退出！！");
                break;
            }


        }
    }
}
