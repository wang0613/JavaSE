package cn.itcast.p11.wrapper;

public class NewPerson02 extends Person{

    /**
     * 继承模式: 继承重写其方法
     */

    @Override
    void eat() {
        System.out.println("开胃酒！");
        super.eat();
        System.out.println("甜点！");
        System.out.println("牛排！");
    }
}
