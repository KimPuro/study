package src;
import java.util.Scanner;

public class calc {
    private int result;

    public void addNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("하고 싶은 계산을 입력하세요 (+, -, *, /, % : )");
        var option = scanner.nextLine();
        System.out.println("첫번째 숫자를 입력하세요 :");
        var firstNumber = scanner.nextInt();
        System.out.println("두번째 숫자를 입력하세요 :");
        var secondNumber = scanner.nextInt();
        switch (option) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "%":
                result = firstNumber % secondNumber;
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                break;
        }
    }

    public int getResult() {
        return result;
    }
}