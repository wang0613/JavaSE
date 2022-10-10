package demo11;
/*
     *****
     ****
     ***
     **
     *
 */
public class Test02 {
    public static void main(String[] args) {

        //i初始化为5，自减到1，表示5行
        for (int i = 5; i >= 1 ; i--) {

            //i等于5，进入内层循环，j <= (i=5),第一行长度为5
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
