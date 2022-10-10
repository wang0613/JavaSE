package cn.itcast.demo13;
/*
员工抽象类
 */
public abstract class Employee {
    private String name;
    private String id;
    private double pay;

    Employee(String name, String id, double pay) {
        this.name = name;
        this.id = id;
        this.pay = pay;
    }
    //工作
    public abstract void work() ;
}
