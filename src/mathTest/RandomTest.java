package src.mathTest;


public class RandomTest {
    int returnRandomNumber(){
        return 80;
    }
    public static void main(String[] args) {
        RandomTest randomTest = new RandomTest();
        int randomNum = randomTest.returnRandomNumber();
        System.out.println("리턴된 값 : " + randomNum);

    }
}
