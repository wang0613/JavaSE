package cn.itcastday13.demo03;
/*
如果一个类中包含另一个类，那么里面的这个类叫做内部类。
例如：身体和心脏，摩托车和发动机的关系。
分类：
1.成员内部类
2.局部内部类（包含匿名内部类）
成员内部类的定义格式：
修饰符  class   外部类名称 {
     修饰符  class  内部类名称 {
     //--
        }
        //---
    }
注意：内用外，可以随意访问。外用内，一定需要借助内部类对象。
--------------------------------------------
如何使用：
1.间接方式：在外部类的方法中使用内部类，然后main方法只是调用外部类的方法。
2.直接方式：公式：
类名称 对象名 = new 类名称（）；
【外部对象名称.内部对象名称 对象名 = new 外部类名称（）.new 内部类名称（）；】
 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        //（1）通过外部类的对象，调用外部类的方法，间接使用里面的内部类Heart
        body.methodBody();
        System.out.println("-------------------------------");
        //(2)按公式
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }
}
