package demo11;
/*
&*****
&&****
&&&***
&&&&**
&&&&&*
 */
public class Test04 {
    public static void main(String[] args) {

        //外循环5行
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i ; j++) {
                System.out.print("");
            }
            //第一行让他打印4个
            for (int k = 5;k >= i; k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
