package src;
import java.util.*;

public class ArrayTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] arr = new int[count];
        Arrays.setAll(arr, i -> sc.nextInt());
        System.out.println(Arrays.toString(arr));

        /*for (int value : arr) {
            System.out.println(value);*/ // for-each 루프를 통해 출력

        /*for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);*/ // for 루프를 통해 출력
        }
    }
