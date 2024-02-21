package src.memberOOP;
public class Member {
    private String id;
    private String pw;
    private String name;
    private String personId;
    private String phoneNumber;
    private String address;
    private String job;
    private double kg;
    private double cm;

    //카우프 지수에서 사용하는 생성자
    public Member(double cm, double kg) {
        this.cm = cm;
        this.kg = kg;
    }

    // 회원가입에서 사용하는 생성자;
    public Member(String id, String pw, String pwAgain, String name, String personId, String phoneNumber, String address, String job) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.personId = personId;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.job = job;
    }

    public int returnRandomCm() {
        return (int) (Math.random() * 50) + 150;
    }

    public int returnRandomKg() {
        return (int) (Math.random() * 100) + 30;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public void setPwAgain(String pwAgain) {
        if (pw.equals(pwAgain)) {
            this.pw = pw;
        } else {
            System.out.println("비밀번호가 일치하지 않습니다.");
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public String getName() {
        return name;
    }

    public String getPersonId() {
        return personId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public String getJob() {
        return job;
    }

    public double getCm() {
        return cm;
    }

    public double getKg() {
        return kg;
    }

    public void setCm(double cm) {
        this.cm = cm;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public String toString() {
        return "아이디: " + id + "\n비밀번호: "
                + pw + "\n이름: " + name + "\n주민번호: " + personId
                + "\n전화번호: " + phoneNumber + "\n주소: " + address + "\n직업: " + job
                + "\n키: " + cm + "\n몸무게: " + kg + "bmi: " + kg / (cm * cm) + "\n";
    }

    public void createBmi() {
        System.out.printf("BMI : %.1f", kg / (cm * cm));

    }
    public void createBodyMass() {
        double bmi = kg / (cm * cm);
        if (bmi < 18.5) {
            System.out.println("저체중");
        } else if (bmi < 23) {
            System.out.println("정상");
        } else if (bmi < 25) {
            System.out.println("과체중");
        } else if (bmi < 30) {
            System.out.println("비만");
        } else {
            System.out.println("고도비만");
        }
    }
}

