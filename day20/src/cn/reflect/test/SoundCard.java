package cn.reflect.test;

public class SoundCard implements PCI {

    @Override
    public void open() {
        System.out.println("sound open ····");
    }

    @Override
    public void close() {
        System.out.println("sound close···");
    }
}
