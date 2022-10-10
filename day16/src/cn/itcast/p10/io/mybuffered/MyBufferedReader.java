package cn.itcast.p10.io.mybuffered;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 自定义的读取缓冲区，其实就是模拟一个BufferReader
 * <p>
 * 分析：
 * 缓冲区中无非就是封装了一个数组
 * 并提供了更多的方法对数组进行了访问
 * 其实这些方法最终作的都是数组的角标
 * <p>
 * 缓冲的原理：
 * 其实就是从源中获取一堆数据装入缓冲区中。
 * 在从缓冲区中不断地取出一个一个数据
 * <p>
 * 但此次取完后，在从源中继续取一堆数据进入缓冲区。
 * 当源中的数据 取光时，用-1作为结束标记。
 */
public class MyBufferedReader extends Reader {

    private FileReader r;
    //定义一个数据作为缓冲区
    private char[] buf = new char[1024];
    //定义一个指针用于操作这个数组中的元素，当操作到最后一个元素是，指针应该归零。
    private int pos = 0;
    //定义一个计数器，用于记录缓冲区的中数据个数，当该数据减到0 ，就从源中 继续获取数据到缓冲区中。
    private int count = 0;

    //对谁高效，就把谁传进去
    MyBufferedReader(FileReader r) {
        this.r = r;
    }

    /**
     * @return 单个读取的方法
     * @throws IOException
     */
    public int myRead() throws IOException {
        //如果缓冲区中的数据为0， 就获取数据到缓冲区
        if (count == 0) {
            count = r.read(buf);
            pos = 0;
        }
        if (count < 0) {
            return -1;
        }
        char ch = buf[pos++];
        count--;
        return ch;

    }

    //缓冲区读取一行的方法
    public String myReadeLine() throws IOException {

        StringBuilder sb = new StringBuilder();
        int ch = 0;

        while ((ch = myRead()) != -1) {
            if (ch == '\r')
                continue;
            if (ch == '\n')
                return sb.toString();
            //将从缓冲区中读取到的字符，存储到缓存行数据的缓存区上
            sb.append((char) ch);

        }
        if (sb.length() != 0)//如果缓冲区内有数据
            return sb.toString();//返回字符串
        return null;
    }

    public void myClose() throws IOException { //内置的关闭流
        r.close();
    }

    //简化版
    public String myReadLine01() throws IOException//谁调用异常抛给谁
    {
        /*定义一个临时容器，原BufferReader封装的是字符数组。
        为了演示方便，定义一个StringBuilder容器。因为最终还是要将数据变成字符串。
        */
        StringBuilder sb = new StringBuilder();//StringBuilder比StringBuffer效率高
        int ch = 0;
        while ((ch = r.read()) != -1)//read()方法，读取单个字符，判断非空，-1表示空 到了结尾
        {
            if (ch == '\r')//判断换行符win，则跳过
                continue;
            if (ch == '\n')//判断换行符linux，则跳过
                return sb.toString();
            else
                sb.append((char) ch);//append()添加进字符
         /*
          append() 1.先实例化
        2.类.append("字符串")  有很多重载，具体查API
        3.用途是当需要大量的字符串拼接时使用  优点效率比+=要高很多 （+=内存中是相当于创建副本重新赋值，StringBuffer是指针的引用）
        */
        }
        if (sb.length() != 0)//如果缓冲区内有数据
            return sb.toString();//返回字符串
        return null;
    }

    //继承自Reader，覆盖重写里面的抽象方法
    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return 0;
    }

    @Override
    public void close() throws IOException {

    }
}
