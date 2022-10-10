package cn.itcast.day18_19.demo03;

/**
 * 泛型接口： 定义在接口上
 * @param <T>
 */
public interface Inter<T> {

    public abstract void show(T t);
}
