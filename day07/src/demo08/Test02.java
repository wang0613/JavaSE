package demo08;

import java.util.Scanner;
/*
依次输入5句话，然后将他逆序输出
 */
public class Test02 {
    public static void main(String[] args) {
        String []array = new  String [5];
        Scanner input = new Scanner(System.in);
        System.out.println("请输入5段话：");
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"句话：");
            array[i]= input.next();
        }
        //倒叙打印5句话
        System.out.println("逆序打印输出的结果为：");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
