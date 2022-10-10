package cn.itcast.demo13;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manage manage = new Manage("群主", 100);

        Member One = new Member("成员A", 0);
        Member Two = new Member("成员B", 0);
        Member Three = new Member("成员C", 0);

        manage.show();
        One.show();
        Two.show();
        Three.show();
        System.out.println("-------------------------");

        //群主发50块钱，6份
        ArrayList<Integer> redList = manage.send(40,3);
        //收红包
        One.receive(redList);
        Two.receive(redList);
        Three.receive(redList);

        manage.show();
        One.show();
        Two.show();
        Three.show();

    }
}
