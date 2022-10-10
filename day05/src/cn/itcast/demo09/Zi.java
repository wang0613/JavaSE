package cn.itcast.demo09;
/*
super关键字用来访问父类内容，this关键字用来访问本类中的内容。
用法：
1.在本类的成员方法中，访问本类的成员变量。
2.在本类的成员方法中，访问本类的另一个成员方法。
3.在本类的构造方法中，访问本类中的另一 个构造方法。
在第三种构造方法中，this（.。。）也必须是构造方法中的第一个语句A:
super和this两种构造调用，不能同时使用。
 */
public class Zi extends Fu {
    int num = 20;

    public Zi(){
        this(20);//本类的无参构造，访问本类的有参构造。
    }
    public Zi(int a ){
        this(20,89);//一个参数的构造方法调用两个参数的构造方法
    }
    public Zi(int a, int b){
//        this();//不能调用回去
    }

    public void showNum(){
        int num =10;
        System.out.println(num);//本类中的局部变量10
        System.out.println(this.num);//本类中的成员变量20
        System.out.println(super.num);//父类中的成员变量100
    }
    public void methodA(){
        System.out.println("aaaaaaa");
    }
    public void methodB(){
        //如果想在调用methodB是把methodA也调用，
        this.methodA();//本类中的成员方法
        System.out.println("bbbbbb");
    }
}
