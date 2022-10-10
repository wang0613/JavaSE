package demo01;
/*
数组的概念：是一种容器，可以存放多个数值。
特点：
1.数组是一种引用类型
2.数组当中的多个数据，类型必须统一。
3.数组运行期间长度不可改变。
常见的两种格式：
1：动态初始化（指定长度）
2. 静态初始化（指定内容）不需要指定个数。
省略格式：int【】arr= {}；省略格式不能拆分为两个步骤
使用建议：
如果不确定数组当中的具体内容，动态初始化，确定内容用静态初始化
 */
public class Demo02Array {
    public static void main(String[] args) {
        int []array = new int []{20,12,22,564,88};
                            // 动态初始化不需要长度
        for (int i =0; i <array.length; i++){
            System.out.println(array[i]);
        }
        String []str = new String[]{"hello","world"}; //字符串类型
        System.out.println("*******************************");
        //静态初始化的标准格式，可以拆分为两个步骤：
        int []arrA;
        arrA = new int []{41,85,87};
        //动态初始化，也可以拆分为两个步骤：
        int []arrB;
        arrB = new int[5];//实例化对象必须有长度
    }
}
