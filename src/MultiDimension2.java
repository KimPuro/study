package src;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1반의 학생 수를 입력:");
        int[] scores1 = generateScores(sc.nextInt());
        System.out.println("2반의 학생 수를 입력:");
        int[] scores2 = generateScores(sc.nextInt());

        printClassStats("1", scores1);
        printClassStats("2", scores2);
    }

    private static int[] generateScores(int numberOfStudents) {
        int[] scores = new int[numberOfStudents];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i] = (int)(Math.random()*100);
        }
        Arrays.sort(scores);
        return scores;
    }

    private static void printClassStats(String className, int[] scores) {
        int sum = Arrays.stream(scores).sum();
        System.out.println(className + "반의 평균: " + (sum/scores.length) + ", 최고 점수: " + scores[scores.length-1]);
    }
}