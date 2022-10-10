package demo01;
/*
直接打印数组名称，得到的是数组对应的内存地址：哈希值
 */
public class Demo03Array {
    public static void main(String[] args) {
        //静态初始化的省略格式
        int []arr = {10,58,89};//索引值0号元素10，
        System.out.println(arr);//[I@16d3586

    }
}
