package src;
public class Main {
    public static void main(String[] args) {
        var calculator = new SwitchCalc();
        calculator.calculate();
        System.out.println("계산 결과 : " + calculator.getResult());
    }
}