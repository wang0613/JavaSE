package cn.itqinghua.demo12;

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
    public void test() {
        //不能继承private修饰成员和方法
        //不同的包,可以继承protected成员
        //不同的包下，子类不能继承默认访问的成员
        //public在不同的包下都可以被继承

    }
}
