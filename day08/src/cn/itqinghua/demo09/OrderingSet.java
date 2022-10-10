package cn.itqinghua.demo09;
//面对对象 三大特征 私有 继承 多态
/**
 * 订单类
 * 姓名  names
 * 所选的信息，（菜品和份数）   dishMegs
 * 送餐时间     times
 * 送餐地址  addresses
 * 订单状态  0已预定  1已完成 states
 * 订单的总金额   sumPrices
 */
public class OrderingSet {

    String[] names = new String[4];
    String[] dishMegs = new String[4];
    int[] times = new int[4];
    String[] addresses = new String[4];
    int[] states = new int[4];
    double[] sumPrices = new double[4];
}
