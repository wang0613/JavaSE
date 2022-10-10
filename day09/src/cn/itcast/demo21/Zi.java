package cn.itcast.demo21;



public class Zi extends Fu {
    int num = 9;
    Zi() {
        super();//1:父类--show（）子类在调用，所以调用的是子类的方法！
        //2：这里进行显示初始化！
        //3：构造函数初始化！
        System.out.println("Zi constructor run" + num);

    }
    void show() {
        System.out.println("show、、" + num);//0 并没有显示初始化
    }
}
