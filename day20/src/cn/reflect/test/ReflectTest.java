package cn.reflect.test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 电脑运行
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {

        MainBoard mb = new MainBoard();
        mb.run();

        //每次添加添加一个设备都需要修改代码，传递一个新创建的对象
//        mb.use(new SoundCard());
        //不修改代码，完成动作，不用new来完成，而是直接获取class文件，在内部实现创建的动作

        //1.将配置文件封装为对象
        File conFile = new File("D:\\IdeaProjects\\S1 -code\\day20\\src\\cn\\reflect\\test\\pci.properties");

        Properties prop = new Properties(); //创建properties集合
        FileInputStream fis = new FileInputStream(conFile); //和流进行关联

        prop.load(fis); //load读取属性列表，将流中的数据 记载到prop集合中

        for (int i = 0; i < prop.size(); i++) {

            String pciName = prop.getProperty("pci" + (i + 1));//获取名称

            Class clazz = Class.forName(pciName);//用class去加载这个pci子类

            PCI p = (PCI) clazz.newInstance();//实例化对象，强转为pci

            mb.use(p);


        }
        fis.close();


    }

}
