package cn.itcast.demo07;

public class Zi extends Fu {

    public Zi() {
        //super必须是第一个语句，
//        super();默认赠送，在调用父类的无参构造方法
        super(20);//在调用父类重载的构造方法
        System.out.println("子类构造方法执行！");
    }
}
