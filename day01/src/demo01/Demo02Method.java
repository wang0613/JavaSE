package demo01;
/*
循环的执行规则：
先执行内循环，在执行外层循环。
* */

public class Demo02Method {
    public static void main(String[] args) {
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 20; i++) {
                System.out.print("*");
            }//先内循环20列不换行，然后执行换行语句，
            System.out.println();
            //再执行外层循环，执行5行
        }
    }
}
