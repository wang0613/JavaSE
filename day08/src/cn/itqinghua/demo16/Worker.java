package cn.itqinghua.demo16;

public class Worker extends Person {
    private double getSalary;

    public double getGetSalary() {
        return getSalary;
    }

    public void setGetSalary(double getSalary) {
        this.getSalary = getSalary;
    }

    public Worker(String name, String gender, int age) {
        super(name, gender, age);
    }

    public Worker() {
        super();
    }


    @Override
    public void show() {

    }
}
