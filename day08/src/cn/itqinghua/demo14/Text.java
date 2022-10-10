package cn.itqinghua.demo14;


public class Text {
    public static void main(String[] args) {
        Pet pet = new Pet("贝贝");
        pet.print();

        Dog dog = new Dog("旺财","金毛");
        dog.print();

        Penguin p = new Penguin("楠楠","女");
        p.print();

    }
}
