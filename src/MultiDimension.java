package src;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("다음 시험에서 두개 반의 평균 점수를 구하시오");

        System.out.println("1반에서 시험에 응시한 학생수는 몇명입니까 ?");
        int numberOfStudent = sc.nextInt();

        System.out.println("2반에서 시험에 응시한 학생수는 몇명입니까 ?");
        int numberOfStudent2 = sc.nextInt();

        int[] scores1 = new int[numberOfStudent];
        int[] scores2 = new int[numberOfStudent2];

        int avg1 = 0;
        int avg2 = 0;
        for (int i = 0; i < scores1.length; i++) {
            scores1[i] = (int)(Math.random()*100);
            avg1 += scores1[i];
        }
        for (int i = 0; i < scores2.length; i++) {

            scores2[i] = (int)(Math.random()*100);
            avg2 += scores2[i];
        }
        Arrays.sort(scores1);
        Arrays.sort(scores2);

        System.out.println("1반의 평균 점수: " + (avg1/scores1.length) + "이고 1등의 점수는 : " + scores1[scores1.length-1] + "입니다.");
        System.out.println("2반의 평균 점수: " + (avg2/scores2.length) + "이고 1등의 점수는 : " + scores2[scores2.length-1] + "입니다.");
    }
}
