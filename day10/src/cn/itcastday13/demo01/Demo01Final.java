package cn.itcastday13.demo01;
/*
final关关键字常见的四种用法：
1.可以用来修饰一个类
2.可以修饰一个方法
3.可以用来修饰一个局部变量
4.可以用来修饰一个成员变量
 */
public  class Demo01Final {

    public static void main(String[] args) {
         int num = 10;//变量
        System.out.println(num);
        num = 20;
        System.out.println(num);
        System.out.println("===========");

        //一旦使用final关键字来修饰局部变量，那么这个值将终生不能改变
        final int numA = 30;
//        numA = 30; 错误写法
        //正确写法,只要保证唯一一次赋值即可。
        final int numB ;
        numB = 40;
        System.out.println(numB);
        System.out.println("===============");
        //对于基本类型来说，不可变说的是变量当中的数据不可改变
        //对于引用类型来说，不可变说的是变量中的地址值不可改变
        Student student = new Student("赵丽颖");
        System.out.println(student);
        System.out.println(student.getName()); //赵丽颖

        student = new Student("霍建华");
        System.out.println(student);
        System.out.println(student.getName());//霍建华
        System.out.println("----------------------");

        final Student stu = new Student("杨过");
        //变量中的地址值不可改变,但是内容是可以发生改变的
        stu.setName("杨过过过");
        System.out.println(stu.getName());
    }
}
