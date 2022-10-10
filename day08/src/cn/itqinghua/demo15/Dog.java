package cn.itqinghua.demo15;

public class Dog extends Pet {
    @Override
    public void show() {
        System.out.println("子类 覆盖重写方法 执行！！");
    }
    public void run() {
        super.show01(); //父类私有方法
        System.out.println("子类私有方法执行！！");
    }
}
