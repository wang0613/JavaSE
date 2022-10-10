package cn.itqinghua.demo03;

public class Student {
    String []array= new String[5];

    //定义一个添加元素的方法
    public void addStudent(String name){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==null){
                array[i]= name;
                break; //结束添加下一个，不然只会打印一个
            }
        }
    }
    //数组遍历的方法
    public void showStudent(){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    /**
     * @returnBoolean
     */                      // 开始的索引位置   结束位置       查找的名字
    public boolean searchName(int startIndex,int endIndex,String searchName){
        boolean flag= false;
        for (int i = startIndex; i <endIndex ; i++) {
            if (searchName.equals(array[i])){
                flag = true;
            }else{
                flag = false;
            }
        }
        return flag;
    }

}
