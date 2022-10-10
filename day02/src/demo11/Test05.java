package demo11;
/*
 *****&
 ****&&
 ***&&&
 **&&&&
 *&&&&&
 */
public class Test05 {
    public static void main(String[] args) {
        //五行
        for (int i = 1; i <= 5; i++) {
            //打印递减的*
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            //打印递增的&
            for (int j = 1; j <= i ; j++) {
                System.out.print("&");
            }
            System.out.println();
        }
    }
}
