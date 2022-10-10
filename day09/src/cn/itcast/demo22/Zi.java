package cn.itcast.demo22;

public class Zi extends Fu {
    int num =9;
    //构造代码块
    {
        System.out.println("constructor code :" +num);
    }
    Zi() {
        super();
        //显示初始化
        //构造代码块初始化

        System.out.println("zi constructor :" + num);
    }
    void show() {
        System.out.println("show、、、"+ num);
    }

}

