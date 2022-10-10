package cn.itcast.day15.demo06;
/*
StringBuffer和StringBuilder 互相兼容，方法都相同。

StringBuilder 1.5版本以后

区别：
StringBuffer：不保证线程同步，[通常用于多线程]
StringBuilder ：保证同步，安全，优先级高，更快。 [通常用于单线程]，提高效率

jdk的升级：
1.简化书写
2.提高效率
3.增加安全性
 */
public class StringBuilderDemo {
    public static void main(String[] args) {

        /*
        class StringBuffer {

        Object lock;
        //两个方法同时运行可能出现线程安全问题，同步方法
        public  StringBuffer append(int x) {
                synchronize(lock) {
                }
             }
        pubic StringBuffer delete(int start ,int end){
                 synchronize(lock) {
                  }
           }
        }

         */
        StringBuilder sb = new StringBuilder();


    }
}
