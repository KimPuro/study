package src.memberOOP;
import java.util.Scanner;
import java.util.function.Consumer;

public class MemberView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디, 비밀번호, 비밀번호 확인, 이름, 주민번호, 전화번호, 주소, 직업을 입력하세요");
        Member member = new Member(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
        System.out.println(member.toString());
    }
}