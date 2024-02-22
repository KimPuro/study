package src.methodTest;
import java.util.Scanner;

public class ReturnName {
    static String returnName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        return scanner.next();
    }
}
