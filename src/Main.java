package src;

public class Main {
    public static void main(String[] args) {
        calc calculator = new calc();
        calculator.addNumbers();
        System.out.println("The sum is: " + calculator.getSum());
    }
}