package cn.reflect.test;

public class MainBoard {

    public void run() {
        System.out.println("my board run····");
    }

    public void use(PCI p) { //PCI p = new SoundCard();
        if (p != null) {
            p.open();
            p.close();
        }
    }

}
