package cn.itqinghua.demo21;

public class Student extends Person {

    private double math;

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    public Student(String name, int age, double math) {
        super(name, age);
        this.math = math;
    }

    @Override
    public void showDim() {
        System.out.println("name: " + super.getName());
        System.out.println("age: " + super.getAge());
        System.out.println("math: " + this.getMath());
    }
}
