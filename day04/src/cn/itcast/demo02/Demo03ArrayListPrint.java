package cn.itcast.demo02;
import java.util.ArrayList;
/*
题目：
定义以指定格式打印元素方法（ArrayList作为参数）使用{}括起来，使用@风格每个元素
格式：
{元素1@元素2@元素3}
 */
public class Demo03ArrayListPrint {

    public static void main(String[] args) {
        ArrayList <String > list = new ArrayList<>();
        list.add("奥巴马");
        list.add("圣枪游侠");
        list.add("卢锡安");
        printArrayList(list);

    }
    /*
    返回值类型：没有运算，没有结果，void
    方法名称：printArrayList
    参数列表：ArrayList<String>list
     */
    public static void printArrayList(ArrayList<String>list){
        System.out.print("{");
        //{20@30@40}
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            //如果是最后一个元素，就打印}，不是就打印name@
            if (i == list.size()-1){
                System.out.print(name +"}");
            }else{
                System.out.print(name + "@");
            }
            //{奥巴马@圣枪游侠@卢锡安}
        }
    }
}
