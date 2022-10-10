package cn.itqinghua.demo19;

public abstract class Pet {

    private String name = "无名 ";
    private int health = 100;
    private int love = 0;

    public abstract void eat(); //抽象方法

    public Pet() {
    }

    public Pet(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    //特有方法
    public void print() {
        System.out.println("宠物的自白" + this.name + "，健康值为：" + this.health + "，亲密度:" + this.love);
    }
}
