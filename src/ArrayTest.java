package src;
import java.util.*;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("몇 개의 배열을 만드시겠습니까?");
        Integer count = sc.nextInt();
        Integer[] arr = new Integer[count];
        System.out.println("배열의 크기는 " + arr.length + "입니다." + arr.length + "개의 자연수를 입력하세요.");
        Arrays.setAll(arr, i -> sc.nextInt());
        System.out.println("원본 배열입니다" + Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("배열을 내림차순으로 정렬하였습니다.");
        System.out.println("가장 큰 수는 " + arr[0] + " 입니다.");

        /*for (int value : arr) {
            System.out.println(value);*/ // for-each 루프를 통해 출력

        /*for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);*/ // for 루프를 통해 출력
        }
    }