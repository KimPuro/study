package src;

public class Gugudan2 {
    public static void main(String[] args) {
        int[][] arr = new int[8][9];
        for (int i = 0; i < 8; i++) {
            System.out.println(i+2 + "단입니다");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = (i + 2) * (j + 1);
                System.out.println((i + 2) + " * " + (j + 1) + " = " + arr[i][j]);

            }
        }
}
}
