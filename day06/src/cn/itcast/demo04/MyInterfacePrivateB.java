package cn.itcast.demo04;

public interface MyInterfacePrivateB {

    public static  void methodStatic1(){
        System.out.println("静态方法1");
      //  methodStatic();
    }
    public static void methodStatic2(){
        System.out.println("静态方法2");
      //  methodStatic();
    }
    //只有本接口中才能访问这个接口中的静态方法
  /*  private static void methodStatic(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

   */


}
