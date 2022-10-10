package cn.itcast.demo08;
/*
代码当中体现多态性：其实就是一句话：父类引指向子类对象。
格式：
父类名称 对象名 = new 子类名称（）；
或者：
接口名称 对象名 = new 实现类名称（）；
 */
public class Demo01Multi {
    public static void main(String[] args) {

        //多态的写法 左侧父类的引用，指向了右侧子类的对象
        //这就是多态
        Fu obj = new Zi();
        obj.method();//子类方法执行了！new的谁就用谁 编译看左，运行看右
        //多态就是一只猫当作一只动物使用，这是没有什么问题的，因为子类就是一个父类
        obj.methodFu();//父类特有的方法
    }
}
