package cn.itcast.day15.demo04;
/*
一个字符串在整串中出现的次数：
    1.要找的子串是否存在，获取其出现的位置，indexOf()返回值int
    2.如果知道了，记录位置，并在剩余的位置中继续查找该子串，起始位是：出现的位置+字符串的长度
    3.以此类推，通过循环查找，找不到就是-1，并对每次找到的用计数器++

 */
public class StringTest02 {
    public static void main(String[] args) {
        String str = "nbaiinbauuqnba";
        String key = "nba";
        int i = getKey(str, key);
        System.out.println("i = " + i);

        int count = getStringKey(str, key);
        System.out.println("count = " + count);

    }
    //第一种方法
     public static int getKey(String str,String key) {
        //1.定义计数器
         int count= 0;
         //2.定义index出现的位置
         int index = 0;

         //3.判断index出现的位置是不是为-1
         while ( (index = str.indexOf(key)) != -1) {
             //nbaiinbauuqnba
             //如果找出第一位按照key的长度进行截取，生成新的字符串再次进行截取
             str = str.substring(index+key.length());
             count++;
         }
         return count;
     }
     //第二种方法
    public static int getStringKey(String str, String key) {
        int count = 0;
        int index =0;
        while ((index = str.indexOf(key,index))!= -1) {
            index = index +key.length();
            count++;
        }
        return count;
    }
}
