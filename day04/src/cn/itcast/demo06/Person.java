package cn.itcast.demo06;
/*
静态代码块格式：
public class 类名称{
    static {
    静态方法块的内容
        }
    }
特点：当第一次用到本类时，静态代码块执行唯一的一次。
 */
public class Person {
    static {
        System.out.println("静态代码块执行！！");
    }
    //构造方法，方法名和类名相同，方法名前面没有任何返回值类型，不能使用return。
    //实例化Person对象时，会自动执行！
    public Person(){
        System.out.println("构造方法执行了！");
    }
}
