package demo11;

/**
 * 武器类
 */
public class Weapon {
    String name;
    int hit ; //攻击力

    public void showWeapon (){
        System.out.println("我叫武器，我的基本信息如下：");
        System.out.println("武器的名字："+ name+ ",攻击力：" + hit);
    }

}
