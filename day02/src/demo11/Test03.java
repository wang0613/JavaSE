package demo11;
/*
%%%%%*
%%%%**
%%%***
%%****
%*****
 */
public class Test03 {
    public static void main(String[] args) {
        //外循环的行数为5，递减到1
        for (int i = 5; i  >= 1 ; i--) {

            //第一行打印5个空格，第二行i ==4，打印4个空格
            for (int j = 1; j <= i ; j++) {
                System.out.print("%");//替换为空格
            }

            //打印一个*号 第二次i=4，循环两次打印两个*
            for (int j = 5; j  >= i ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
