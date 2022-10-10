package cn.itcast.demo12;
/*
这样子类也是一个抽象类
 */
public abstract  class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("够吃骨头");
    }
}
