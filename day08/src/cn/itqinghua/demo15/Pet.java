package cn.itqinghua.demo15;

public abstract class Pet {
    private String name;
    private int love;
    private int heath;

    public Pet() {
        this.heath = 50;
        System.out.println("父类 构造 执行！！");
    }
    public abstract void show();

    public void show01(){
        System.out.println("抽象父类 私有方法");
    }
}
