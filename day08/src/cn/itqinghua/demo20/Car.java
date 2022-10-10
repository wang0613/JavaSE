package cn.itqinghua.demo20;

public class Car extends MotoVehicle {
    private String type;

    public Car(String no, String brand, String type) {
        super(no, brand);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int calRent(int days) {

        if ("1".equals(type)) {
            return days * 500;
        } else if ("2".equals(type)) {
            return days * 600;
        } else {
            return days * 300;
        }
    }
}
