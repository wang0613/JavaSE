package cn.itcast.demo19;
/*
匿名内部类：其实就是一个匿名子类对象。
    格式：
    new 父类or接口名 （） {
        //子类内容！！
    }
 */
public class Outer {

    public void method() {
        //匿名内部类 直接new父类对象==》new的是AbsDemo的子类对象
        new AbsDemo() {
            //匿名内部类必须要覆盖重写抽象方法！
            @Override
            void show() {
                System.out.println("匿名内部类 run");
            }

        }.show(); //调用匿名内部类的方法
    }
}
