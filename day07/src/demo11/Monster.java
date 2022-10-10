package demo11;

/**
 * 怪物类
 */
public class Monster {
    String name;
    int life;
    String type; //类型

    //输出怪物的基本信息
    public void showMonster(){
        System.out.println("我叫怪物，我的基本信息如下：");
        System.out.println("怪物的名字是"+ name+
                ",生命值："+ life+ ",怪物类型："+ type);
    }

}
