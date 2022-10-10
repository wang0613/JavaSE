package cn.itqinghua.demo19;

public class Cat extends Pet {

    private String color;

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //重写吃饭方法
    @Override
    public void eat() {
        if(getHealth() >= 100) {
            System.out.println("狗狗"+this.getName() +"已经吃饱了！！");
        } else  {
            this.setHealth(this.getHealth()+4);
            System.out.println("猫咪"+this.getName()+ "体力增加4！");
        }
    }

}
