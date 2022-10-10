package cn.itcast.demo02;

import java.util.ArrayList;

/*
题目：自定义四个学生对象，添加到集合中，遍历
思路：
1.自定义标准学生类，（private，无参构造，有参构造，getter 和setter）
2.创建一个集合，用来存储学生对象《student》
3.根据类创建四个学生对象
4.添加到集合，add
5.遍历
 */
public class Demo2ArrayListStudent {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("杨过",18);
        Student two = new Student("小龙女",18);
        Student three = new Student("洪七公",85);
        Student four = new Student("欧阳锋",56);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);//放进去的是一个学生，需要接受一下
            System.out.println("姓名是："+stu.getName()+ ",年龄是："+ stu.getAge());
        }
    }
}
