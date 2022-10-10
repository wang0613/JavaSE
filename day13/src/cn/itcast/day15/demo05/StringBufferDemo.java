package cn.itcast.day15.demo05;

/*
StringBuffer：就是字符串缓冲区，用于存储字符串的容器

特点：
    1.长度是可变的
    2.可以存储不同的数据类型
    3.最终要转成字符串使用
    4.可以对字符串进行修改

容器的功能:
    1.添加
    StringBuffer   append();参数类型byte，short除外
    插入 String      insert(位置，数据);
    2.删除
    StringBuffer delete(start,end); 包含头，不包含尾
    StringBuffer deleteCharAt(int index)删除指定位置的元素
    //【清除缓冲区】
    sb.delete(0,sb.length());
    3.查找
    char charAt(index)
    int indexOf(String)
    int lastIndexOf(String)
    4.修改
    StringBuffer replace(int start, int end, String str)
 */
public class StringBufferDemo {
    public static void main(String[] args) {
//        bufferMethodDemo();
//        deleteStringBuffer();
        replaceString();
    }

    public static void bufferMethodDemo() {
        //创建缓冲区对象 ,初始容量16个字符
        StringBuffer sb = new StringBuffer();

        sb.append(4); // 添加一个4
        sb.append(true);

        sb.append(false).append("haha"); //方法调用链

        sb.insert(1,666);
        System.out.println(sb); //4 true false haha
    }
    private static void deleteStringBuffer() {
        StringBuffer sb = new StringBuffer("abc");
//        sb.delete(0,1); //bc

        sb.deleteCharAt(2); //ab

        //清除缓冲区
        sb.delete(0,sb.length());
        System.out.println(sb);
    }
    public static void replaceString () {
        StringBuffer sb = new StringBuffer("abcdefg");
        sb.replace(4,7,"java");
        System.out.println(sb.toString());

    }
}
