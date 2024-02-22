package src.matrixTest;

import java.util.Scanner;

public class MenuSelector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("[메뉴] 0. 종료 1. 진행 2. 수정");
            String menu = sc.next();
            if(menu.equals("0")){
                System.out.println("종료합니다.");
                break;
            } else if(menu.equals("1")){
                System.out.println("진행합니다.");
            } else if(menu.equals("2")){
                System.out.println("수정합니다.");
            } else {
                System.out.println("잘못된 입력입니다.");
            }

        }
    }

}
