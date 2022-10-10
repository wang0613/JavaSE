package demo09;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入行数：");
        int line = input.nextInt();
        int n = (line+1)/2;
        int v = n-1;
        //图案的上半部分
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i + 1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //图案的下半部分
        for(int i = 0; i < v; i++){
            for(int j = 0 ; j < i + 1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < v -i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
