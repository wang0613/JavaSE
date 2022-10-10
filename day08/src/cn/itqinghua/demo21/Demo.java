package cn.itqinghua.demo21;

public class Demo {

    public void show(Person [] per) {
        for (int i = 0; i< per.length; i++) {
            per[i].showDim();
            System.out.println("-----------------");

        }
    }
}
