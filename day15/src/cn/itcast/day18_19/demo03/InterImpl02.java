package cn.itcast.day18_19.demo03;

public class InterImpl02<Q> implements Inter<Q> {
    @Override
    public void show(Q q) {
        System.out.println("show: = " + q);
    }
}
