package cn.itcast.day18_19.demo03;

public class InterImpl implements Inter<String> {

    @Override
    public void show(String s) {
        System.out.println("string = " + s);

    }
}
