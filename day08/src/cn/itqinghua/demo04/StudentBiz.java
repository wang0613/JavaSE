package cn.itqinghua.demo04;
/*
  键盘输入  循环添加到数组的方法  修改数组的元素
 */
public class StudentBiz {
    String []names = new String [5];

    /**
     * 添加数组元素的方法
     * @param name
     */
    public void addName(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i]==null){
                names[i]= name;
                break;
            }
        }
    }

    /**
     * 数组遍历的方法
     */
    public void showName(){
        System.out.println("学生姓名为：");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i]+"\t");
        }
    }

    /**
     * 替换查找数组元素的方法
     * @param oldName
     * @param newName
     * @return flag
     */
    public boolean editName(String oldName, String newName){
        boolean flag = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(oldName)){
                flag = true;
                names[i]= newName;
                break;
            }
        }
        return flag;
    }
}
