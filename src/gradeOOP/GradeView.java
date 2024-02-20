package src.gradeOOP;
import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Grade grade = new Grade();
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요");
        grade.setName(sc.next());
        grade.createGrade();

        System.out.println("이름: " + grade.getName());
        System.out.println("국어: " + grade.getGrade(0));
        System.out.println("영어: " + grade.getGrade(1));
        System.out.println("수학: " + grade.getGrade(2));
        System.out.println("평균: " + grade.getGrade(3));
    }
}