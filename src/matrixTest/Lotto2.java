package src.matrixTest;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto2 {
    public static void main(String[] args){
        BuyLotto bl = new BuyLotto();
        CreateLotto cl = new CreateLotto();
        MatchLotto ml = new MatchLotto();
        int[] arr1 = bl.buyLotto();
        int[] arr2 = cl.createLotto();
        int count = ml.matchLotto(arr1, arr2);
        System.out.println("당첨 번호는 " + Arrays.toString(arr2) + "입니다.");
        System.out.println(count + "개 맞았습니다.");

    }
}

class BuyLotto {
    int[] arr1 = new int[6];
    int[] buyLotto() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 5; i++) {
            arr1[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr1[i] == arr1[j]) {
                    i--;
                    break;
                }
            }
        }
        return arr1;
    }
}

class CreateLotto{
    int[] arr2 = new int[6];
    int[] createLotto(){
        for (int i = 0; i<=5; i++){
            arr2[i] = (int)(Math.random()*44)+1;
            for(int j = 0; j<i; j++){
                if (arr2[i] == arr2[j]){
                    i--;
                    break;
                }
            }
        }
        return arr2;
    }
}

class MatchLotto{
    int matchLotto(int[] arr1, int[] arr2){
        int count = 0;
        for (int i = 0; i<6; i++){
            for (int j = 0; j<6;j++){
                if(arr1[i] == arr2[j]){
                    count++;
                }
            }
        }
        return count;
    }
}