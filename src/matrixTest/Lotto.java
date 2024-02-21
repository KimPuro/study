package src.matrixTest;
import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        int temp;
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = (int) (Math.random() * 44) + 1;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    i--;
                    break;
                }

            }
        }
//        Arrays.sort(numbers); // 배열을 오름차순으로 정렬해주는 메소드

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        System.out.println(line() + Arrays.toString(numbers) + line());
    }
    static String line() {
        return "\n==================================\n";
    }
}
