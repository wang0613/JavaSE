package cn.itqinghua.demo06;

public class Demo01Student {
    public static void main(String[] args) {
        //对象数组
        Student []stu = new Student[5];

        Student s1 = new Student();
        s1.name= "郭靖";
        s1.age= 103;
        s1.id = "ff2001";
        s1.score= 66;

        Student s2 = new Student();
        s2.name= "小孔女";
        s2.age= 10;
        s2.id = "ff2661";
        s2.score= 96;

        //把对象放进对象数组内
        stu[0]= s1;
        stu[1]= s2;

        for (int i = 0; i < stu.length; i++) {
            if (stu[i]!= null){
                System.out.println("姓名："+stu[i].name + "年龄："+ stu[i].age + "，ID:"+ stu[i].id+ ",得分："+ stu[i].score);
            }
        }

    }
}
