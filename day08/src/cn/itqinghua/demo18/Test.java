package cn.itqinghua.demo18;

public class Test {
    public static void main(String[] args) {

        //父类指向了子类对象
        Person p = null;
        p = new Student();

        p.say();

        p = new Worker();
        p.say();

        //调用静态方法
        Temp.show(new Student());

        Temp.show(new Worker());

    }
}
