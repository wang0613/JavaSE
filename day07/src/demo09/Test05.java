package demo09;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pass= 0;//输入密码
        int pad = 111111;//用户密码
        int getMoney= 0;//获得的钱
        boolean flag = false;

        for (int i = 3; i >=1; i--) {
            System.out.println("请输入密码：");
            pass = input.nextInt();
            if (pass ==pad){
                flag = true;
            }else if (pass != pad){
                System.out.println("密码错误，还有"+ (i-1)+"次机会");
                continue;
            }

            if (flag){
                System.out.println("请输入取款金额：");
                getMoney = input.nextInt();
                if (getMoney >0 && getMoney <= 1000 && getMoney % 100 == 0){
                    System.out.println("请取走您的钞票"+ getMoney);
                    break;
                }else {
                    System.out.println("您输入的金额不合法：");
                    continue;
                }
            }
            if (i ==0){
                System.out.println("密码错误，程序结束！");
            }

            }




        }
    }

