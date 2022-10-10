package cn.itcast.demo03;

public class ConsDemo {
    public static void main(String[] args) {

        //构造函数会在创建对象时，调用
        Person person = new Person(); //Person run
//        new Person(); 傻逼行为
//        person.Person();
        person.speak();//baby:1

        Person p = new Person("旺财");//创建带参数的对象
        p.speak(); //旺财:0

        Person p1 = new Person("小强",10);
        p1.speak(); //小强:10

    }
}
