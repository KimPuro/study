package src;
import java.util.Scanner;

public class SwitchCalc {
        public static void main (String[] args){
            int result = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("하고 싶은 계산을 입력하세요 (+, -, *, /, % : )");
            var opcode = scanner.nextLine();
            System.out.println("첫번째 숫자를 입력하세요 :");
            var firstNumber = scanner.nextInt();
            System.out.println("두번째 숫자를 입력하세요 :");
            var secondNumber = scanner.nextInt();
            switch (opcode) {
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
            System.out.println("결과는 " + result + "입니다.");
        }

    }