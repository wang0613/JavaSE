package cn.itcast.demo05;
/*
重写：Override  方法名称一样，参数列表【也】一样
重载：Overload：方法名称一样，参数列表篇【不】一样
方法覆盖重写的注意事项：、
1.必须保证父子类之间的方法名相同，参数列表也一样
  @Override：写在方法前面，用来检测是不是有效的覆盖重写。

2.子类方法的返回值必须【小于等于父类的返回值范围】
    object类是所有类的公共最高类

 3.子类的权限必须【大于等于】大于父类方法的修饰符
   public > protected > (default)> private
                        //default 时什么都不写，留空。
 */
public class Demo01Override {
    public static void main(String[] args) {

        Zi z = new Zi();
        System.out.println(z.method());
    }
}
