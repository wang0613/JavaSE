package demo02;
/*
强制类型转换：
    格式： 范围小的类型 范围小的变量名= （范围小的类型）原本范围大的数据
注意事项：
    1.不推荐使用，有可能发生精度损失，数据溢出。
    2.byte / short / int / char 都可以发生数学运算，如加法“+”
    3..byte / short / int / char 在运算的时候，都会被首先提升为int类型，然后计算。
    4.boolean布尔类型不能参加数据类型转换
     */
public class Demo02DateType {
    public static void main(String[] args) {
        //long转为int，不一样，long比int大；
        // int num = 100L;
        // 格式： 范围小的类型 范围小的变量名= （范围小的类型）原本范围大的数据
        int num1 = (int) 50L;
        System.out.println(num1);

        int num2 = (int) 80000000000L;
        System.out.println(num2);// -1604378624数据溢出

        //double强制转换为int
        int num3 =(int) 2.5;
        System.out.println(num3);//2 精度损失了，小数点丢失了，不是四舍五入，小数点都会被舍掉，

        char ziFu1 = 'A';
        System.out.println(ziFu1 + 1);//66 ,A在编码表中表示65
        /*
        计算机底层会用一个数字（二进制）来代表A 就是65；
        一旦char类型进行了数学运算，那么字符就会按照一定的规则翻译成一个数字；
        */
        byte num4 = 40;
        byte num5 = 50;
        //byte + byte --->  int + int -->int
        int result = num4 + num5;
        System.out.println(result);//90

        short num6 = 60;
        //short + int ----> int + int = int
        int result2 = num4 + num6;
        //int强制转换为short：必须保证逻辑上真实大小没有超过short范围，否则发生数据溢出。
        short result3 = (short) (num4 + num6);
        System.out.println(result2);
        System.out.println(result3);//100

    }
}
