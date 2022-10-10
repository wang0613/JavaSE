package cn.itcast.demo06;
/*
一旦使用Static修饰成员方法，那么晚变成了静态方法，静态方法不属于对象，而是属于类的。

如果没有static关键字，那么必须先创建对象，然后通过对象来调用。
如果有static关键字，可以直接通过类名称来调用

 */
public class Demo01StaticMethod {
    public static void main(String[] args) {

        MyClass obj = new MyClass();//首先创建对象
        obj.method();//然后才能使用static关键字的内容

        //对于静态方法来说，可以通过对象名来调用，也可以直接通过类名称来调用
       // obj.methodStatic();//不推荐
        MyClass.methodStatic();

    }
}
