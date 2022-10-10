package cn.itqinghua.demo03;
import java.util.Scanner;

public class Demo01Student {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student s1 = new Student();

        //循环添加名字进入数组
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"的名字：");
            String name = "";
            name = input.next();
            s1.addStudent(name);//调用添加名字的方法
        }
        s1.showStudent();//调用数组便利的方法

        System.out.println("请输入要查找的名字：");
        String answer = input.next();
        //调用searchName的方法
        boolean flag = s1.searchName(0,5,answer);
        if (flag){
            System.out.println("找到了！！！");
        }else{
            System.out.println("没有找到！！");
        }

    }
}
