package cn.itcast.demo18;

/*
内部类的访问特点：
1.内部类可以访问外部类的成员
2.外部类要访问内部类， 必须要创建对象！
一般用于类的设计：
来分析事物时，发现该事物描述中，还有事物，而且这个事物还在访问被描述事物的内容！
这时就是还有的事物定义成内部类来描述。
 */
public class Outer {

    private static int num = 20;

    //private只在本类中有效,外部不能创建对象！
    /* private*/  static class Inter { //如果内部类是静态的，相当于一个外部类
        void show() {
            System.out.println("show run" + num); //静态中访问的内容必须是静态的！
        }
        //内部类的静态方法
        //如果内部中定义了静态方法，该内部类也是静态的！

        static void function () {
            System.out.println("static function run()");
        }
    }

    //通过成员函数访问内部类！
    public void method() {
        Inter i = new Inter();
        i.show();
    }
}
