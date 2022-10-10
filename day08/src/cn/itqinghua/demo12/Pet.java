package cn.itqinghua.demo12;

public class Pet {
    /**
     * 父类
     */
    private String name = "无名氏";
    private int health = 100;
    private int love = 0;

    //无参构造
    public Pet() {
        this.health = 95;
        System.out.println("Pet 无惨构造执行了！！");
    }

    //一个参数的构造
    public Pet(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLove() {
        return love;
    }

    /**
     * 宠物的输出信息
     */
    public void print() {
        System.out.println("姓名：" + this.name +
                ",我的健康值是：" + this.health + ",我和主人的亲密度是：" + this.love);
    }
}
