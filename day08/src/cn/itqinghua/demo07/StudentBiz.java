package cn.itqinghua.demo07;

public class StudentBiz {
    //对象数组
    Student []stu = new Student[5];

    //如果数组中没有元素就把新元素付给他
    public void addStudent(Student student){
        for (int i = 0; i < stu.length; i++) {
            if (stu[i]==null){
                stu[i]= student;
                break;
            }
        }
    }

    public void showDim(){
        for (int i = 0; i < stu.length; i++) {
           if (stu[i]!=null){
               stu[i].showDim();//如果元素不为空，打印数组中对象的方法
           }
        }
    }
}
