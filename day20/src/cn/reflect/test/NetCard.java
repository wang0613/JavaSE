package cn.reflect.test;

public class NetCard implements PCI {
    @Override
    public void open() {
        System.out.println("netCard open·····");
    }

    @Override
    public void close() {
        System.out.println("netCard close·····");
    }
}
