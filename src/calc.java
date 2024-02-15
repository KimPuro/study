package src;
import java.util.Scanner;

public class calc {
    private int sum;

    public void addNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = scanner.nextInt();
        System.out.println("Enter the second number:");
        int b = scanner.nextInt();
        this.sum = a + b;
    }

    public int getSum() {
        return this.sum;
    }
}