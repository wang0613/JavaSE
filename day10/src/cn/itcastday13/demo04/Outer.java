package cn.itcastday13.demo04;
/*
如果一个类是定义在一个方法中的，那么这个类就是一个局部内部类。
“局部”只有这个方法才能使用它。
定义格式：
修饰符 class 外部类名称{
      修饰符 返回值类型 外部类的方法名称（）{
         class 局部内部类名称{
            //----
         }
      }
  }
总结类的修饰符： public > protected > (default) > private
定义一个类的时候，权限修饰符的规则：
1.外部类： public / (default)
2.成员内部类:public / protected / (default) > private
3.局部内部类：什么都不能写
 */
public class Outer {

    public void methodOuter (){
        //Inner局部内部类
        class Inner {
            int num = 10;
            //局部内部类的方法
            public void methodInner() {
                System.out.println(num); //10
            }
        }
        //通过调用外部类来创建局部内部类的对象
        //局部的内部类只能在本类的方法中调用
        Inner inner = new Inner();
        inner.methodInner();

    }
}
