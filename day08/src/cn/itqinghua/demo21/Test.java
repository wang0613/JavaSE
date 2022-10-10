package cn.itqinghua.demo21;

public class Test {
    public static void main(String[] args) {

        Person [] per = new Person[3];

        per[0] = new Student("cc",20,89.9);
        per[1] = new Worker("aa",50,2003);
        per[2] = new Student("ii",10,30.9);

//        for (int i = 0; i< per.length; i++) {
//            per[i].showDim();
//            System.out.println("-----------------");
//
//        }
        Demo m = new Demo();
        m.show(per);


    }
}
