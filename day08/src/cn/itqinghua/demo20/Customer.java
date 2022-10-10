package cn.itqinghua.demo20;

public class Customer {

    String id;
    String name;

    public Customer(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int calcTotalRent(MotoVehicle[] motoVehicles, int days) {
        int sum = 0;
        for (int i = 0; i < motoVehicles.length; i++) {
            sum += motoVehicles[i].calRent(days);
        }
        return sum;
    }
}
