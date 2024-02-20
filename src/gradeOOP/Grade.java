package src.gradeOOP;

public class Grade {
    private int[] Grade = new int[4];
    private String name;
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getGrade(int num) {
        return Grade[num];
    }
    public void createGrade() {
        Grade[0] = (int)(Math.random()*100);
        Grade[1] = (int)(Math.random()*100);
        Grade[2] = (int)(Math.random()*100);
        Grade[3] = (Grade[0] + Grade[1] + Grade[2]) / 3;
    }
}
