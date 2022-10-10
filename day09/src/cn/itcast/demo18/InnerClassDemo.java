package cn.itcast.demo18;

public class InnerClassDemo {
    public static void main(String[] args) {

       /* Outer o = new Outer();
        o.method();         */

       //直接访问内部类中的成员
//        Outer.Inter in  = new Outer().new Inter();创建外部对象。内部类
//        in.show();

        //如果内部类是静态的，相当于一个外部类。
//        Outer.Inter in = new Outer.Inter();
//            in.show();
        //如果内部类是静态的，成员是静态的！--》直接通过类名调用！
        Outer.Inter.function();
    }
}
