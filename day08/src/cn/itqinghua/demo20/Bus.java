package cn.itqinghua.demo20;

public class Bus extends MotoVehicle {

    private int seatCount;

    public Bus(String no, String brand, int seatCount) {
        super(no, brand);
        this.seatCount = seatCount;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public int calRent(int days) {  //客车租价
        if (seatCount <= 16) {
            return days * 800;
        } else
            return days * 1500;

    }
}
