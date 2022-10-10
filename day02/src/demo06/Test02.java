package demo06;

import java.util.Scanner;

/*
键盘输入10个年龄，比较大小，30以上站的百分比
 */
public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ageUp = 0;//30岁以上
        int ageDown = 0;//30岁一下
        int age = 0;//输入的年龄！
        for (int i= 1; i <= 10; i++){
            System.out.println("请输入第" + i + "的成绩！！");
            age = input.nextInt();
            if (age >= 30){
                ageUp++;
            }else if (age <30 && age >= 0){
                ageDown++;
            }
        }                           //   4/10.0 = 0.4 * 100-> 40= %
        System.out.println("30岁以下的人："+ ageUp/10.0 *100 + "%");
        System.out.println("30岁以上的人："+ ageDown/10.0 *100 + "%");

    }
}
