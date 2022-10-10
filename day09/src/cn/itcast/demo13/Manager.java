package cn.itcast.demo13;

public class Manager extends Employee {
    private int bonus;

    Manager(String name, String id, double pay, int bonus) {
        super(name,id,pay);
        this.bonus = bonus;
    }
    @Override
    public void work() {
        System.out.println("manager、、、");
    }
}
