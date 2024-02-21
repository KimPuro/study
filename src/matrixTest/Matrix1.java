package src.matrixTest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] mtx = new int[5][5];
        System.out.println("25개의 숫자를 한 번에 입력해야 합니다.");
        for (int i = 0; i < mtx.length; i++) {
            Arrays.setAll(mtx[i], j -> sc.nextInt());
        }
            System.out.println("입력한 숫자는 다음과 같습니다.");
            System.out.println(Arrays.deepToString(mtx).replace("], ", "]\n"));
    }
}
