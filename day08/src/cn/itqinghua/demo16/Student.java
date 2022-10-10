package cn.itqinghua.demo16;

public class Student extends Person {

    private double math;

    public Student(String name, String gender, int age, double math) {
        super(name, gender, age);
        this.math = math;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }

    @Override
    public void show() {
        System.out.println("重写方法执行");
    }

}
