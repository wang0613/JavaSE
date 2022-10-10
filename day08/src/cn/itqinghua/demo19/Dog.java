package cn.itqinghua.demo19;

public class Dog extends Pet {
    private String strain;

    @Override
    public void eat() {
        if(getHealth() >= 100) {
            System.out.println("狗狗"+this.getName() +"已经吃饱了！！");
        } else  {
            this.setHealth(this.getHealth()+4);
            System.out.println("狗狗"+this.getName()+ "体力增加4！");
        }
    }
    public void catchingFlyDisc() {
        System.out.println("狗狗："+this.getName() +"正在接飞盘！！");
        this.setHealth(this.getHealth()-10);
        this.setLove(this.getLove()+5);
    }
    public Dog(String name, String strain) {
        super(name);
        this.strain = strain;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    //重写 父类的方法
    @Override
    public void print() {
        super.print();
        System.out.println("我是一只：" +this.strain);
    }

}
