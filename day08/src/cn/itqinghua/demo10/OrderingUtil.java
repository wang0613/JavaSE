package cn.itqinghua.demo10;

import java.util.Scanner;

public class OrderingUtil {
    String[] dishNames = {"红烧带鱼", "鱼香肉丝", "时令蔬菜"};
    double[] prices = new double[]{38.0, 20.0, 10.0};
    int[] praiseNums = new int[3]; //点赞数
    //实例化对象
    OrderingSet set = new OrderingSet();
    Scanner input = new Scanner(System.in);

    //菜单切换方法
    public void startMenu() {
        int num = -1;
        boolean isExit = false;
        System.out.println("欢迎使用吃货联盟订餐系统：");
        do {
            System.out.println("*******************");
            System.out.println("1: 我要订餐");
            System.out.println("2：查看餐袋");
            System.out.println("3：签收订单");
            System.out.println("4：删除订单");
            System.out.println("5：我要点赞");
            System.out.println("6：退出系统");
            System.out.println("********************");
            System.out.println("请选择：");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("****我要订餐***");
                    add();
                    break;
                case 2:
                    System.out.println("***查看餐袋***");
                    display();
                    break;
                case 3:
                    System.out.println("***签收订单***");
                    sign();
                    break;
                case 4:
                    System.out.println("***删除订单***");
                    delete();
                    break;
                case 5:
                    System.out.println("***我要点赞***");
                    praise();
                    break;
                case 6:
                    isExit = true;
                    System.out.println("欢迎下次使用！！！");
                    break;
                default:
                    isExit = true;
                    break;

            }
            if (!isExit) {
                System.out.println("按0返回上一级菜单：");
                num = input.nextInt();

            } else {
                break;
            }
        } while (num == 0);
    }

    //参看餐袋的方法
    void display() {
        System.out.println("序号" + "\t订餐人" + "\t产品信息" + "\t送餐时间" + "\t送餐地址" + "\t订单状态" + "\t总金额");
        for (int i = 0; i < set.names.length; i++) {
            if (set.names[i] != null) {
                String state = set.states[i] == 0 ? "已预定" : "已完成";
                System.out.println((i + 1) + "\t\t" + set.names[i] + "\t" + set.dishMegs[i] + "\t\t" + set.times[i] + "点" + "\t" + set.addresses[i] + "\t" + state + "\t" + set.sumPrices[i] + "元");
            }
        }
    }

    //订餐的方法
    boolean add() {
        boolean isAdd = false;
        //找到添加的位置
        for (int j = 0; j < set.names.length; j++) {
            if (set.names[j] == null) {
                isAdd = true;
                System.out.println("请输入订餐人的姓名：");
                String name = input.next();
                //遍历菜单：选额菜品
                System.out.println("编号\t菜品名称\t价格\t点赞数");
                for (int i = 0; i < dishNames.length; i++) {
                    String praise = praiseNums[i] > 0 ? praiseNums[i] + "赞" : "0";
                    System.out.println((i + 1) + "\t" + dishNames[i] + "\t" + prices[i] + "\t" + praise);
                }
                //用户点餐
                System.out.println("请输入要点的菜的编号：");
                int chooseDish = input.nextInt();
                System.out.println("请输入份数：");
                int number = input.nextInt();
                //在数组中的菜品
                String dishMeg = dishNames[chooseDish - 1];
                //菜品的金额
                double sumPrice = prices[chooseDish - 1] * number;
                //餐费
                double deliCharge = sumPrice >= 50 ? 0 : 5;
                //送餐时间
                System.out.println("请输入送餐时间：(10-20整点送餐)");
                int time = input.nextInt();
                while (time < 10 || time > 20) {
                    System.out.println("请重新输入");
                    time = input.nextInt();
                }
                //请输入送餐地址：
                System.out.println("请输入送餐地址：");
                String address = input.next();

                System.out.println("订餐成功！");
                System.out.println("您订的是：" + dishMeg + number + "份");
                System.out.println("送餐时间：" + time);
                System.out.println("餐费为：" + sumPrice + "送餐费：" + deliCharge);
                System.out.println("总金额：" + (sumPrice + deliCharge));

                set.names[j] = name;
                set.dishMegs[j] = dishMeg;
                set.times[j] = time;
                set.addresses[j] = address;
                set.sumPrices[j] = (sumPrice + deliCharge);
                break;

            }
        }
        if (!isAdd) {
            System.out.println("餐袋已满！！！");
            return false;
        } else
            return true;
    }

    //签收订单的方法
    void sign() {
        boolean isSignFind = false;
        System.out.println("请选择要签收的订单：");
        int singOrderId = input.nextInt();
        for (int i = 0; i < set.names.length; i++) {
            if (set.names[i] != null && set.states[i] == 0 && singOrderId == i + 1) {
                set.states[i] = 1;
                isSignFind = true;
                System.out.println("订单签收成功！！");
            } else if (set.names[i] != null && set.states[i] == 1 && singOrderId == i + 1) {
                isSignFind = true;
                System.out.println("订单已签收， 无需重复签收！！");
            }
        }
        if (!isSignFind) {
            System.out.println("您选择的订单不存在！！！！");
        }
    }

    //删除订单的方法
    void delete() {
        boolean isDelFind = false;
        System.out.println("请选择要删除的订单编号：");
        int delId = input.nextInt();
        for (int i = 0; i < set.names.length; i++) {
            if (set.names[i] != null && set.states[i] == 1 && delId == i + 1) {
                isDelFind = true;
                //从删除的元素开始
                for (int j = delId - 1; j < set.names.length - 1; j++) {
                    set.names[j] = set.names[j + 1];
                    set.states[j] = set.states[j + 1];
                    set.sumPrices[j] = set.sumPrices[j + 1];
                    set.addresses[j] = set.addresses[j + 1];
                    set.dishMegs[j] = set.dishMegs[j + 1];
                    set.times[j] = set.times[i];

                }

                int endIndex = set.names.length - 1;
                set.names[endIndex] = null;
                set.states[endIndex] = 0;
                set.sumPrices[endIndex] = 0;
                set.addresses[endIndex] = null;
                set.dishMegs[endIndex] = null;
                set.times[endIndex] = 0;

                System.out.println("订货删除成功！！！！");
                break;

            } else if (set.names[i] != null && set.states[i] == 0 && delId == i + 1) {
                System.out.println("您的订单为签收不能删除！！！");
                isDelFind = true;
                break;
            }
        }
        if (!isDelFind) {
            System.out.println("未找到您的订单！！！！");
        }
    }

    //点赞的方法
    void praise() {
        System.out.println("序号" + " 菜品" + "单价" + "点赞数");
        for (int i = 0; i < dishNames.length; i++) {
            String praise = praiseNums[i] > 0 ? praiseNums[i] + "赞" : "";
            System.out.println((i + 1) + dishNames[i] + prices[i] + praise);
        }
        System.out.println("请选择您要点赞的菜品：");
        int choose = input.nextInt();
        praiseNums[choose - 1]++;
        System.out.println("点赞成功！ ");
    }

}
