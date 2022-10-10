package cn.itcast.day16_17.demo05;

/*
LinkedList 面试题：
    请使用LinkedList模拟一个堆栈或者队列数据结构

    堆栈： 先进后出  firstIn  lastOut  FILO

    队列： 先进先出  firstIn  firstOut FIFO

我们应该描述这样的一个容器，给使用提供一个容器对象完成这两种结构中的一种。

 */
public class LinkedListTest {





    public static void main(String[] args) {

        Queue q = new Queue();
        q.myAdd("abc1");
        q.myAdd("abc2");
        q.myAdd("abc3");

        while (!q.isNull()) {
            System.out.println(q.myGet());
        }
    }

}