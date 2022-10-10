package cn.itcastday13.demo01;
/*
当final修饰一个类的时候，此类不能有任何子类（太监类）。不能被继承，有父类。
格式：
public final class 类名称{
}
注意：如果一个类如果是final的，那么这个类所有的成员方法不能进行覆盖重写（因为没有儿子）。

 */
public final class MyClass /* extends Object */ {

    public void method(){
        System.out.println("方法执行！！");
    }


}
