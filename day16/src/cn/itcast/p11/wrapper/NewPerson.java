package cn.itcast.p11.wrapper;

public class NewPerson {
    /**
     * 这个类的出现 就是为了增强Person而出现的
     */
    private Person p;

    NewPerson(Person p) {
        this.p = p;
    }

    public void eat() {
        System.out.println("开胃酒！");
        p.eat();
        System.out.println("甜点！");
        System.out.println("牛排！");
    }
}
