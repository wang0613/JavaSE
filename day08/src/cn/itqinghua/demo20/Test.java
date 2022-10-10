package cn.itqinghua.demo20;

public class Test {
    public static void main(String[] args) {

        int days ;
        int totalRent;

        MotoVehicle [] motos = new MotoVehicle[4];
        motos[0] = new Car("666","宝马","550");
        motos[1] = new Car("888","奔驰","g");
        motos[2] = new Car("111","奥迪","a4");
        motos[3] = new Bus("999","别克",34);

        days = 5; //租用时间

        Customer cus = new Customer("9527","星");
        totalRent = cus.calcTotalRent(motos,days);

        //输出姓名 和费用

        System.out.println("汽车牌号\t\t品牌");
        for (int i = 0; i < motos.length; i++) {
            System.out.println(motos[i].getNo()+"\t"+motos[i].getBrand());

        }
        System.out.println("客户名："+cus.getName() +"，天数："+days+"，费用："+totalRent);
    }
}
