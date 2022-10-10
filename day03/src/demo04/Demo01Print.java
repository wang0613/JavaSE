package demo04;
/*
打印矩形
 */
public class Demo01Print {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
