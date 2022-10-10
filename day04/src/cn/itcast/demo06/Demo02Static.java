package cn.itcast.demo06;
/*
静态代码块格式：
public class 类名称{
    static {
    静态方法块的内容
        }
    }
特点：当第一次用到本类时，静态代码块执行唯一的一次。
静态的内容总是优先于非静态，所以静态代码块比构造方法先执行
静态代码块的典型用途：
用来一次性对静态成员变量进行赋值
 */
public class Demo02Static {
    public static void main(String[] args) {
        Person p = new Person();
        Person o = new Person();
        //静态代码块执行！！
        //构造方法执行了！
    }
}
