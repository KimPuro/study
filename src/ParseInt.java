package src;
import java.util.Scanner;
public class ParseInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째 숫자를 입력하세요 :");
        String number1 = scanner.nextLine();
        System.out.println("두 번째 숫자를 입력하세요 :");
        String number2 = scanner.nextLine();
        int result = Integer.parseInt(number1);
        int result2 = Integer.parseInt(number2);
        System.out.println("두 수의 합은 : " + (result + result2));
    }
}
