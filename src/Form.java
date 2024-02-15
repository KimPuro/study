package src;
import java.util.Scanner;

public class Form {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("id를 입력하세요 :");
        var id = scanner.nextLine();
        System.out.print("password를 입력하세요 :");
        var password = scanner.nextLine();
        System.out.print("password를 다시 입력하세요 :");
        var passwordRepeat = scanner.nextLine();
        System.out.print("이름을 입력하세요 :");
        var name = scanner.nextLine();
        System.out.print("주민번호를 입력하세요 :");
        var juminNumber = scanner.nextLine();
        System.out.print("전화번호를 입력하세요 :");
        var phoneNumber = scanner.nextLine();
        System.out.print("주소를 입력하세요 :");
        var address = scanner.nextLine();
        System.out.print("직업을 입력하세요 :");
        var job = scanner.nextLine();
        System.out.println("id: "+id);
        System.out.println("password: "+password);
        System.out.println("passwordRepeat: "+passwordRepeat);
        System.out.println("name: "+name);
        System.out.println("juminNumber: "+juminNumber);
        System.out.println("phoneNumber: "+phoneNumber);
        System.out.println("address: "+address);
        System.out.println("job: "+job);
    }
}