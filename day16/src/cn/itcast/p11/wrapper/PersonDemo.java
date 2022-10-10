package cn.itcast.p11.wrapper;

/**
 * 装饰设计模式：
 */
public class PersonDemo {
    public static void main(String[] args) {

        Person p = new Person();
//        p.eat();

        NewPerson newPerson = new NewPerson(p);
        newPerson.eat(); //装饰思想，person进行了增强

        NewPerson02 p2 = new NewPerson02();
        p2.eat();

    }

}
