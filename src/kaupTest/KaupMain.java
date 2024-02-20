package src.kaupTest;

public class KaupMain {
    public static void main(String[] args) {
        double m = (Math.random() * 50.0 + 150.0)/100.0;
        double kg = Math.random() * 100.0 + 30.0;
        System.out.printf("BMI : %.1f", kg/(m*m));
    }
}
