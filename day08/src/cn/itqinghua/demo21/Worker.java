package cn.itqinghua.demo21;

public class Worker extends Person {

    private int salary;

    public Worker(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void showDim() {
        System.out.println("name: " + super.getName());
        System.out.println("age: " + super.getAge());
        System.out.println("math: " + this.getSalary());
    }

}
