package src.matrixTest;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Lotto {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        Scanner sc = new Scanner(System.in);



        try {

            int money = 0;
            int count =0;
            int count2 = 0;
            while (count <= 6) {
                Future<int[]> future1 = es.submit(Lotto::createLotto);
                Future<int[]> future2 = es.submit(Lotto::createLotto);
                int[] Lotto1 = future1.get();
                int[] Lotto2 = future2.get();
                count = 0;
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (Lotto1[i] == Lotto2[j]) {
                            count++;
                        }
                    }
                }
                switch (count) {
                    case 6:
                        System.out.println("1등입니다.");
                        break;
                    case 5:
                        System.out.println("2등입니다.");
                        break;
                    case 4:
                        System.out.println("3등입니다.");
                        break;
                    case 3:
                        System.out.println("4등입니다.");
                        break;
                    default:
                        System.out.println("꽝입니다.");
                        System.out.println("시행 횟수: " + count2);
                        System.out.println("Lotto1: " + Arrays.toString(Lotto1));
                        System.out.println("Lotto2: " + Arrays.toString(Lotto2));
                        count2++;
                        money += 1000;
                        System.out.println("총 지출 금액: " + money + "원");
                        break;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            es.shutdown();
        }

    }

    static int[] createLotto() {
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
        return numbers;
    }
}
/*
package src.matrixTest;
import java.util.Arrays;
        public class Lotto {
            public static void main(String[] args) {
                int count = 0;
                while (count <= 3) {
                    int[] Lotto1 = createLotto();
                    int[] Lotto2 = createLotto();
                    count = 0;
                    for (int i = 0; i < 6; i++) {
                        for (int j = 0; j < 6; j++) {
                            if (Lotto1[i] == Lotto2[j]) {
                                count++;
                            }
                        }
                    }
                    switch (count) {
                        case 6:
                            System.out.println("1등입니다.");
                            break;
                        case 5:
                            System.out.println("2등입니다.");
                            break;
                        case 4:
                            System.out.println("3등입니다.");
                            break;
                        case 3:
                            System.out.println("4등입니다.");
                            break;
                        default:
                            System.out.print("꽝입니다. ");
                            break;
                    }

                }
            }

            static int[] createLotto() {
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
                Arrays.sort(numbers);
                return numbers;
            }
        }
*/


/*
        for (int i = 0; i < 6; i++) {
        for (int j = 0; j < 5; j++) {
        if (numbers[j] > numbers[j + 1]) {
temp = numbers[j];
numbers[j] = numbers[j + 1];
numbers[j + 1] = temp;
                }
                        }
                        }*/

