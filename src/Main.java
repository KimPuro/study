package src;

public class Main {
    public static void main(String[] args) {
        Calc calculator = new Calc();
        calculator.calculate();
        System.out.println("계산 결과는 : " + calculator.getResult());
    }
}