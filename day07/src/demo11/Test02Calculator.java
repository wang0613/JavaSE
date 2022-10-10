package demo11;

/**
 * calculator的实现类
 */
public class Test02Calculator {
    public static void main(String[] args) {

        Calculator ca = new Calculator();
        ca.numA =10;
        ca.numB = 2;
        ca.add();
        ca.sub();
        ca.mul();;
        ca.div();
    }
}
