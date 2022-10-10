package cn.itcast.day15.demo05;
/*
StingBuffer中的修改：

设置指定位置的字符串
void        setCharAt(int index, char ch)
设置字符序列的长度
setLength(int newLength)
导致该字符序列被序列的相反代替。
StringBuffer      reverse()
 */
public class StringBufferDemo02 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("aqabc");

        //初始16字符，但是可以设置长度
        StringBuffer stringBuffer = new StringBuffer(4);

        setStringBuffer(sb);

    }
    public static void setStringBuffer(StringBuffer sb) {
        sb.setCharAt(0,'q');
        sb.setLength(5); //设置StringBuffer的长度为5,多的元素无效
        System.out.println(sb);
        System.out.println(sb.length()); //5
        System.out.println(sb.reverse());//cbaqq 翻转打印

    }
}
