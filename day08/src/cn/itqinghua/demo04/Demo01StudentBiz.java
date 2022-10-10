package cn.itqinghua.demo04;

import java.util.Scanner;

public class Demo01StudentBiz {
    public static void main(String[] args) {
       StudentBiz stu = new StudentBiz();
        Scanner input = new Scanner(System.in);
        String name = "";
        //循环添加进入数组
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入姓名"+ (i+1)+";");
            name = input.next();
            stu.addName(name);
        }

        //数组遍历的方法
        stu.showName();

        System.out.println("请输入旧名字：");
        String oldName = input.next();
        System.out.println("请输入新名字：");
        String newName = input.next();

        //传参，调用方法
        boolean b = stu.editName(oldName, newName);
        System.out.println("修改成功了吗？"+ b);

        stu.showName();
    }
}
