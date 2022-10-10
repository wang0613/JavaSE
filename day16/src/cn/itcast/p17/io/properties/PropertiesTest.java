package cn.itcast.p17.io.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesTest {
    public static void main(String[] args) throws IOException {
        /**
         *  练习：获取一个应用程序运行的次数，如果超过5次，给出使用次数已到请注册的提示，并不要在运行程序
         *
         *  思路：1.应该有计数器，每次程序启动都应该记录一次，并且是原有的次数上进行计数
         *       2.计数器就是一个变量，程序启动时进行计数，计数器必须存在于内存并进行运算。
         *    可是程序结束，计数器消失，那么再次启动改程序，计数器重新初始化了
         *    而我们需要多次启动同一个应用程序，使用同一个计数器
         *    这就需要计数器的生命周期变长，从内存存储到硬盘文件中。
         *      3.如何使用计数器?
         *   首先，程序启动时，应该先读取这个用于记录计数器信息的配置文件。
         *   获取上一次计数次数，并进行使用次数的判断
         *   其次，对该次数进行自增，并将自增后的次数，重新存储到配置文件中。
         *     4.文件中的信息该如何进行存储和体现？
         *   直接存储可以，但是不确定该数据的含义，所以起名字变得很重要
         *   这就有了名字和值的对应，所以可以使用键值对
         *   可是映射关系map集合，又需要读取硬盘中的数据，所有map+io = Properties
         */
        getAppCount();


    }

    public static void getAppCount() throws IOException {

        //将配置文件封装为对象
        File confile = new File("count.properties");

        if (!(confile.exists())) {
            confile.createNewFile(); //如果文件不存在，创建一个
        }

        FileInputStream fis = new FileInputStream(confile); //输入流读取对象

        Properties prop = new Properties();

        prop.load(fis); //从输入流 加载到 集合

        //从集合中通过键来获取值
        String value = prop.getProperty("time");

        //定义技术器，获取记录到的次数
        int count = 0;
        if (value != null) {
            count = Integer.parseInt(value); //转化为 int

            if (count >= 5) {
                System.out.println("使用次数已到，请注册，购买正版！");
                throw new RuntimeException("");
            }
        }
        count++;

        //将改变后的集合重新存储到集合中
        prop.setProperty("time", Integer.toString(count)); //只能字符串存储

        FileOutputStream fos = new FileOutputStream(confile);

        prop.store(fos, ""); //输出到输出流中

        fos.close();
        fis.close();


    }
}
