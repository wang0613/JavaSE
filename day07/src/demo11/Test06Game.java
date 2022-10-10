package demo11;

public class Test06Game {
    public static void main(String[] args) {

        Hero hero = new Hero();
        Monster monster = new Monster();
        Weapon weapon = new Weapon();

        hero.name = "李小侠";
        hero.life = 99;
        hero.showHero();

        monster.name = "大大怪";
        monster.life = 100;
        monster.type = "陆地型";
        monster.showMonster();;

        weapon.name = "青龙偃月刀";
        weapon.hit = 500;
        weapon.showWeapon();
    }
}
