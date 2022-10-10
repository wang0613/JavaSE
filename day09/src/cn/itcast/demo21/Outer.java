package cn.itcast.demo21;

public class Outer {

   void method() {

       class Inner {
           //创建一个object子类对象
       Object obj = new  Object() {
               public void show() {
                   System.out.println("show run");
               }
           };
//       obj.show();
        //为什么挂？
           //因为匿名内部类这个子类对象被向上转型为了Object类型
           //这样就不能使用子类的特有方法了！！
       }
   }
}
