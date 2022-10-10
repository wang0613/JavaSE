package cn.itcast.demo09;

/*
多态中成员变量的访问特点.

访问成员变量的两种方式：
1.通过对象名直接点来调用： 等号左边是谁，就优先用谁。
2.间接通过成员方法：看该方法属于谁，就优先用谁，没有向上找
 */
public class Demo01MultiFiled {
    public static void main(String[] args) {
        //使用多态的写法，父类引用执行一个子类对象
        Fu obj = new Zi();
        //直接通过对象名称点，等号左边是谁就优先用谁，
        System.out.println(obj.num);//10
        System.out.println("-----------------------------------");

        //子类没有覆盖重写，就是父
//       obj.showNum();//10
        //子类如果覆盖重写，就是子类
        obj.showNum();//20
    }
}
