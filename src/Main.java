package src;

public class Main {
    public static void main(String[] args) {
        calc calculator = new calc();
        calculator.addNumbers();
        System.out.println("계산 결과는 : " + calculator.getResult());
    }
}