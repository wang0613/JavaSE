package cn.itcast.day18_19.demo07;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 * Map集合练习:
 * "fdgavcbsacdfies" ,获取该字符串，每一个字母出现的次数
 * 要求打印的是：a(2) b(1) ···
 * <p>
 * 思路：对于结果法分析发现字母和数字存在映射关系，而且很多。
 * 能存储映射关系的容器有数组和Map集合
 * 关系一方是有序编号吗 ？ 没有
 * 可以保证唯一性的一方，具备顺序 ，可以使用TreeMap集合
 * <p>
 * 这个集合中最终应该存储的是字母和次数的对应关系？
 * 1.字符串转换为字符数组
 * 2.遍历字符数组，用每一个字母作为键来去查询Map集合表
 * 如果该字母键不存在，就将该字符作为键，1作为值存储到map集合中
 * 如果该字母键存在，就将该字母键对应的值取出并 ++，再将该字母和++后的值存储到Map集合中
 * 键相同值会覆盖，这样就记录字母的次数
 * 3.遍历结束，map集合中就记录了所有字母的出现次数
 */
public class MapTest01 {
    public static void main(String[] args) {

        String str = "fdgavcbsacdfies";

        String result = getCharCount(str);
        System.out.println(result);


    }

    private static String getCharCount(String str) {
        //字符串转换为字符数组
        char[] chars = str.toCharArray();
        //定义一个Map集合
        Map<Character, Integer> map = new TreeMap<>();

        for (int i = 0; i < chars.length; i++) {
            //用来判断非法的字符
            if (!(chars[i] >= 'a' && chars[i] <= 'z' || chars[i] >= 'A' && chars[i] <= 'Z')) {
                continue;  //不添加
            }

            //将数组中的字母作为键，去查表
            Integer value = map.get(chars[i]);

            //判断值是否为空
//            if (value == null) {
//                map.put(chars[i],1);
//            }else {
//                map.put(chars[i],value+1);
//            }
            //简化写法
            int count = 0;
            if (value != null) {
                count = value;
            }
            count++;
            map.put(chars[i], count);
        }
        return getMapToString(map);
    }

    private static String getMapToString(Map<Character, Integer> map) {
        StringBuilder sb = new StringBuilder();
        Iterator<Map.Entry<Character, Integer>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Character, Integer> me = it.next();
            Character key = me.getKey();
            Integer value = me.getValue();

            sb.append(key + "(" + value + ")");

        }
        return sb.toString();
    }
}
