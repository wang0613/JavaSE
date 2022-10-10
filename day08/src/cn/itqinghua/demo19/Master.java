package cn.itqinghua.demo19;

public class Master {

    private String name;
    private int money;

    public Master(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    //给宠物喂食
    public void feed(Pet pet) {
        pet.eat();
    }

    public Pet getPet(int typed) {
        Pet pet = null;

        if (typed == 1) {
            pet= new Dog("欧","金毛");
        } else if (typed ==2) {
            pet = new Penguin("楠楠","女");
        }
        return pet;
    }
    public void play(Pet pet) {

        if (pet instanceof Dog) {
            Dog dog = (Dog) pet;
            dog.catchingFlyDisc();

        } else if (pet instanceof Penguin) {
            Penguin penguin =(Penguin) pet;
            penguin.swimming();
        }

    }
}
