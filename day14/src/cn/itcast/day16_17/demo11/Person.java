package cn.itcast.day16_17.demo11;

/**
 * 实现Comparable接口，可以根据自然顺序，进行比较，覆盖重写里面的compareTo方法
 */
public class Person implements Comparable {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    compareTo: 比较对象与指定对象的顺序，如果对象小于，等于或者大于指定对象。则分别返回 负整数 零或者 正整数
     */
//    @Override
//    public int compareTo(Object o) {
//        if (!(o instanceof Person)) { //用来判断前面对象能不能当作后面的类型
//            throw new ClassCastException("类型转换异常");
//        }
//        Person p = (Person) o;

        //简写形式 如果临时变量等于0 就比较名字顺序，不等于0就按照年龄排序
        //以Person对象的[年龄]进行从小到大的排序
//        int temp = this.age - p.age;
//        return temp == 0 ? this.name.compareTo(p.name) : temp;

        //按照姓名排序
//        int temp = this.name.compareTo(p.name);
//        return temp == 0 ? this.age -p.age : temp;

        //从大到小 转换位置或者改变 return 数值
//        if (this.age > p.age) {
//            return 1;
//        }
//        if (this.age < p.age) {
//            return -1;
//        }
//        if (this.age == p.age) {
//       //如果年龄相同就比较姓名，姓名是一个字符串，字符串本身就具备着继承自Comparable接口中的compareTo方法
//           return this.name.compareTo(p.name);
//        }
//        return 0;
//    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Object o) {
        Person p = (Person) o;

        int temp = this.age - p.age;
        return temp == 0 ? this.name.compareTo(p.name) : temp;
    }
}
