package demo07;

import java.util.Scanner;

/*
键盘上输入1-5查看日程
 */
public class Test03 {
    public static void main(String[] args) {
        System.out.println("查看日程表，请输入日期（1-5）");
        Scanner input= new Scanner(System.in);
        int day = input.nextInt();
        switch(day){
            case 1:
                System.out.println("参加股东大会！");
                break;
            case 2:
                System.out.println("参加海洋公园！");
                break;
            case 3:
                System.out.println("参加qq大会！");
                break;
            case 4:
                System.out.println("参加It剪裁大会！！");
                break;
            case 5:
                System.out.println("自由时间！！！");
                break;
            default:
                System.out.println("输入有误！！");
        }

    }
}
