package demo08;

import java.util.Scanner;
public class Demo04AddCustomer {
    public static void main(String[] args) {
        String name = "";
        int pass = 0;
        int count = 3;
        Scanner input = new Scanner(System.in);
       for (int i =1; i <= 3; i++){
           System.out.println("请输入用户名：");
           name = input.next();
           System.out.println("请输入密码");
           pass = input.nextInt();
           count--;//计数器
           //String 的字符串比较方法
           if (name.equals("jim")&&pass == 123456){
               System.out.println("欢迎登陆MyShopping！！");
               break;
           }else {
               System.out.println("输入错误！！，您还有"+ count+ "次机会");
           }
           if (count == 0){
               System.out.println("对不起，3次均输入错误！");
               break;
           }

       }
    }
}
