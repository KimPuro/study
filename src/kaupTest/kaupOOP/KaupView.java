package src.kaupTest.kaupOOP;
import src.memberOOP.Member;

import java.util.Scanner;

public class KaupView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Member person = new Member(returnRandomCm(), returnRandomKg());
        KaupService service = new KaupServiceImpl();
        double bmi = service.createBmi();
        String bodyMass = service.createBodyMass();
        service.createBmi();
        service.createBodyMass();
        System.out.println("m : " + person.getM());
        System.out.println("kg : " + person.getKg());
        System.out.println("BMI : " + bmi);
        System.out.println("당신은 " + bodyMass + "입니다.");
    }
}
