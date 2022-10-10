package cn.itqinghua.demo14;

public class Dog extends Pet {
    private String strain;

    /**
     * 带参数的构造函数
     */
    public Dog(String name, String strain) {
        super(name); //调用父类的构造函数
        //super和this在一个构造函数下只能存下一个
        this.strain = strain;

    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
    //覆盖重写
    @Override
    public void print() {
        super.print();//父类成员方法
        System.out.println("我是："+getStrain()+"犬");
    }

}
