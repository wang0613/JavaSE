package cn.itcast.day18_19.demo07;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        //LinkedHash
        HashMap<Integer,String> hm = new LinkedHashMap<>();

        File file = null;
        hm.put(7,"zhou");
        hm.put(3,"ai");
        hm.put(8,"sister");
        hm.put(2,"anger");

        Iterator<Map.Entry<Integer,String>> it = hm.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<Integer,String> me = it.next();
            Integer key = me.getKey();
            String value = me.getValue();
            System.out.println(key+"= " + value);
        }

    }
}
