package cn.itcast.day18_19.bean;

public class Worker extends Person {

    public Worker() {
    }

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Worker : "+ getName()+getAge();
    }
}
