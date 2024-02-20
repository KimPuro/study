package src.memberOOP;
import java.util.Scanner;

public class MemberView {
    public static void main(String[] args) {
        Member member = new Member();
        Scanner sc = new Scanner(System.in);
        System.out.println("아이디를 입력해주세요");
        member.setId(sc.next());
        System.out.println("비밀번호를 입력해주세요");
        member.setPw(sc.next());
        System.out.println("비밀번호를 다시 한번 입력해주세요");
        member.setPwAgain(sc.next());
        System.out.println("이름을 입력해주세요");
        member.setName(sc.next());
        System.out.println("주민번호를 입력해주세요");
        member.setPersonId(sc.next());
        System.out.println("전화번호를 입력해주세요");
        member.setPhoneNumber(sc.next());
        System.out.println("주소를 입력해주세요");
        member.setAddress(sc.next());
        System.out.println("직업을 입력해주세요");
        member.setJob(sc.next());

        System.out.println("아이디는 " + member.getId() + "입니다.");
        System.out.println("비밀번호는 " + member.getPw() + "입니다.");
        System.out.println("이름은 " + member.getName() + "입니다.");
        System.out.println("주민번호는 " + member.getPersonId() + "입니다.");
        System.out.println("전화번호는 " + member.getPhoneNumber() + "입니다.");
        System.out.println("주소는 " + member.getAddress() + "입니다.");
        System.out.println("직업은 " + member.getJob() + "입니다.");


    }
}