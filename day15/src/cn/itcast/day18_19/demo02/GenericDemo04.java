package cn.itcast.day18_19.demo02;

public class GenericDemo04 {
    public static void main(String[] args) {

        Tool<String> tl = new Tool<String>();

        tl.show("String str");
        tl.print("haha ");

    }
}
