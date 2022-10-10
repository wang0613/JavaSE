package demo11;
/*
打印正的直角三角形
   *
   **
   ***
   ****
 */
public class Test01 {
    public static void main(String[] args) {
            //1-5外层循环控制行数
        for (int i = 1; i <5 ; i++) {

            //i初始化为1，j <= i,第一行打印1个，下一次i为2打印两个
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
