package cn.itcast.demo10;

public class Test {
    private int num;

    //保证对象的单一性 3步骤
    private Test() {

    }

    private static Test t = new Test();

    public static Test getInstance() {
        return t;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
