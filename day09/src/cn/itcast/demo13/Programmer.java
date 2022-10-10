package cn.itcast.demo13;
//程序员类
public class Programmer extends Employee{

    Programmer(String name, String id, double pay) {
        super(name,id,pay);//调用父类的构造
    }

    @Override
    public void work() {
        System.out.println("Code、、、");
    }
}
