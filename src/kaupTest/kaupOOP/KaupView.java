package src.kaupTest.kaupOOP;
import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {
        Person person = new Person();
        Scanner scanner = new Scanner(System.in);
        System.out.println("당신의 몸무게를 입력하세요 : ");
        System.out.println("당신의 키를 입력하세요 : ");
        person.createM();
        person.createBmi();
        System.out.println("m : " + person.getM());
        System.out.println("kg : " + person.getKg());
        System.out.println("BMI : " + person.getBmi());
        System.out.println("당신은 " + person.getBodyMass() + "입니다.");
    }
}
