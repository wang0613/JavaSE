package cn.itqinghua.demo19;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Master master = new Master("wang",100);

        System.out.println("欢迎您来到宠物店！");
        System.out.print("请选择要领养的宠物类型：（1、狗狗 2、企鹅）");
        int typeId = input.nextInt(); // 1,2.

        Pet pet=master.getPet(typeId);  // new Dog();  new Penguni();
        if(pet!=null){
            System.out.println("领养成功！");
            pet.setHealth(80);  //设置健康值，以便正常喂食
            master.feed(pet); //喂动物吃饭。
            master.play(pet);
        }else{
            System.out.println("对不起，没有此类型的宠物，领养失败");
        }

    }
}
