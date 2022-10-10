package demo11;

public class Test05Computer {
    public static void main(String[] args) {
        Computer computer = new Computer();

        computer.cpu = "AMD";
        computer.board = "华硕";
        computer.lcd = "三星";
        computer.disk = "金士顿";
        computer.memory = "东芝";

        computer.showInFo();
    }
}
