package cn.itcast.day16_17.demo05;

import java.util.LinkedList;

/**
 * 队列
 */
public class Queue {
    private LinkedList link;

    //构造函数初始化
    Queue() {
        link = new LinkedList();
    }

    /**
     * 队列的添加元素的方法
     * @param obj
     */
    public void myAdd(Object obj) {
        link.addLast(obj);
    }

    /**
     * 获取元素的方法
     * @return
     */
    public Object myGet(){
        return link.removeFirst();
    }

    /**
     * 判断是否为空的方法
     * @return
     */
    public boolean isNull() {
        return link.isEmpty();
    }

}
