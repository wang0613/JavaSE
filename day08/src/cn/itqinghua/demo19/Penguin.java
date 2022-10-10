package cn.itqinghua.demo19;

public class Penguin extends Pet {
    private String Sex;
    public Penguin(String name, String sex) {
        super(name);
        Sex = sex;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("性别是：" + this.Sex);
    }

    @Override
    public void eat() {
        if (getHealth() >= 100) {
            System.out.println("企鹅" + this.getName() + "已经吃饱了！！");
        } else {
            this.setHealth(this.getHealth() + 4);
            System.out.println("企鹅" + this.getName() + "体力增加4！");
        }

    }

    public void swimming() {
        System.out.println("企鹅：" + this.getName() + "正在游泳！！");
        this.setHealth(this.getHealth() - 10);
        this.setLove(this.getLove() + 5);
    }
}
