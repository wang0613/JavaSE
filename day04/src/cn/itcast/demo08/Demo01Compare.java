package cn.itcast.demo08;
/*
需求：
动物园有两只老虎，已知两只老虎的体重为110kg 200kg
请用程序判断两只老虎的重量是否相同？
 */
public class Demo01Compare {
    public static void main(String[] args) {
        int weight = 110;
        int weightB = 200;
        boolean flag = weight== weightB ? true: false;
        System.out.println("两只老虎的体重相同？"+ flag);
    }

}
