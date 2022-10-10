package cn.itcast.day18_19.demo07;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {

        /*
        map在有映射关系时，可以考虑使用

        查表法中应用较为常见
         */


    }
    public static String getWeekMap(String week) {

        Map<String,String> map = new HashMap<>();

        map.put("星期一","Mon");
        map.put("星期二","Tus");
        map.put("星期三","Wes");
        map.put("星期四","Mon");
        map.put("星期五","Mon");
        map.put("星期日","Sun");
        map.put("星期天","Sun");

        return map.get(week);
    }
}
