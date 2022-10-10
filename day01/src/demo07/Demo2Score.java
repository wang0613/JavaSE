package demo07;

import java.util.Scanner;

/*
键盘输入一个成绩：
100满分
90-100优秀
70-90良好
60-70及格
0-60不及格
-0和100+数据异常
 */
public class Demo2Score {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩：");
        while (true){
            double score = input.nextDouble();
            if (score <0 || score >100){
                System.out.println("数据异常！！");
                System.out.println("请重新输入：0");
            }else if (score == 100){
                System.out.println("恭喜，满分成绩！！");
                break;
            }else if (score >=90 && score <100 ){
                System.out.println("优秀！！");
                break;
            } else if (score >=80 && score <90){
                System.out.println("良好！！");
                break;
            }else if (score >= 60 && score <80){
                System.out.println("及格了！！");
                break;
            }else if (score >= 0 && score < 60){
                System.out.println("不及格！！");
                break;
            }

        }

    }
}
