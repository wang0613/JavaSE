package cn.itqinghua.demo14;

public class Penguin extends Pet {
    private String sex;

    public Penguin(String name, String sex) {
        super(name); //父类构造
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    //覆盖重写
    @Override
    public void print() {
        super.print();//父类成员方法
        System.out.println("我是："+getSex()+"的企鹅");
    }
}
