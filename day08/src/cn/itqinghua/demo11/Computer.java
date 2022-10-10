package cn.itqinghua.demo11;

public class Computer {
    protected String name;
    int score;
    public int showFirst() {

        int random = (int) (Math.random() * (4 - 1)) + 1;
        switch (random) {
            case 1:
                System.out.println("电脑出拳：剪刀");
                break;
            case 2:
                System.out.println("电脑出拳：石头");
                break;
            case 3:
                System.out.println("电脑出拳：布");
                break;
            default:
                break;

        }
        return random;
    }
}
