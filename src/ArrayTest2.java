package src;
import java.util.*;
public class ArrayTest2{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("다음 시험에서 1등 학생의 이름과 점수를 구하시오");
    System.out.println("시험에 응시한 학생수는 몇명입니까? : ");
    int num = sc.nextInt(), max = 0, index = 0;
    String[] name = new String[num];
    int[] score = new int[num];
   for(int i=0; i<num; i++){
       System.out.println((i+1)+"번째 학생의 이름과 점수를 입력하시오 : ");
       name[i] = sc.next();
       score[i] = sc.nextInt();
       if(score[i] > max){
           max = score[i];
           index = i;
       }
    }
    System.out.println("1등 학생은 "+name[index]+"이고 점수는 "+max+"점 입니다.");
    }
}
