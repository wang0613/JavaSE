package cn.itcastday13.demo08;

public class Demo {

    // 没catch就没有处理，必须要声明！
    public int show(int index)  throws ArrayIndexOutOfBoundsException{

        if (index < 0) {
            throw new ArrayIndexOutOfBoundsException("角标越界了！");
        }
        int []arr = new int[3];
        return arr[index];
    }
}
