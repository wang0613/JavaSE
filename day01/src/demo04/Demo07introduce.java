package demo04;
/*
个人介绍 ： 马云
键盘输入
 String name = "";//姓名
        int age = 0 ;//年咯
        char sex  = ' ';//性别
        long money = 0;//有多少钱
        float english = 0.0f;//英语成绩
        double math = 0.00;//数学成绩
        boolean sexNan = true;//有没有小鸡鸡
        byte laoPo = 0;//几个老婆
 */

import java.util.Scanner;

public class Demo07introduce {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = "";
        char sex = ' ';
        int age = 0;
        long money = 0;
        float english = 0.0f;
        double math = 0.0;
        boolean nanRen = true;
        byte laoPo = 0;

        System.out.println("请输入姓名：");
        name = input.next();//String类型特殊写法
        System.out.println("请输入性别：");
        sex = input.next().charAt(0);//char单个字符的特殊写法
        System.out.println("请输入年龄：");
        age = input.nextInt();
        System.out.println("财产有多少？");
        money = input.nextLong();
        System.out.println("英语成绩为：");
        english = input.nextFloat();
        System.out.println("数学成绩为：");
        math = input.nextDouble();
        System.out.println("有几个老婆“");
        laoPo = input.nextByte();

        System.out.println("姓名: " + name + "，性别：" + sex + ",年龄："+ age + ",有多少钱："+ money
                + "，英语成绩：" + english + "，数学成绩："+ math +"，有几个老婆："+ laoPo+ "个。");

    }
}
