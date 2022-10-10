package demo11;

/**
 * 第五题：英雄类
 */
public class Hero {
    String name ;
    int life ;//生命值

    //输出英雄的基本信息
    public void showHero(){
        System.out.println("我叫英雄，我的基本信息如下：");
        System.out.println("英雄的名字是："+ name + ",生命值："+ life);
    }
}
