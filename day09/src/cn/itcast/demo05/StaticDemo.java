package cn.itcast.demo05;

public class StaticDemo {
    int num = 10;

    public static void main(String[] args) {

//        Person p1 = new Person();
//        p1.name= "小强";
//        p1.show();
        new StaticDemo().show(); //创建对象
    }


    public void show() {
        System.out.println(num);
    }
}
