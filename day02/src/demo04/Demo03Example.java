package demo04;
import java.util.Scanner;
/*
do while写出yes可以考试
 */
public class Demo03Example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println("上午练习代码");
            System.out.println("下午阅读理解");
            answer = input.next();
        }while(!answer.equals("yes"));
        System.out.println("开始考试！！！");

    }
}
