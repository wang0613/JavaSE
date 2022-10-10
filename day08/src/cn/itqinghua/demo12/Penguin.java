package cn.itqinghua.demo12;

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
}
