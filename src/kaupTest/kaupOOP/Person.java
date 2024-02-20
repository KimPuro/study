package src.kaupTest.kaupOOP;

public class Person {
    private double m;
    private double kg;
    private double bmi;
    private String bodyMass;

    public void createM() {
        m = (Math.random() * 50.0 + 150.0)/100.0;
        createKg();
    }

    public double getM() {
        return m;
    }

    public void createKg() {
        kg = Math.random() * 100.0 + 30.0;
    }

    public double getKg() {
        return kg;
    }

    public double getBmi() {
        return bmi;
    }

    public void createBmi() {
        bmi = kg / (m * m);
        createBodyMass();
    }
    public String getBodyMass() {
        return bodyMass;
    }
    public void createBodyMass() {
        if (bmi < 18.5) {
            bodyMass="저체중";
        } else if (bmi < 23) {
            bodyMass="정상";
        } else if (bmi < 25) {
            bodyMass="과체중";
        } else if (bmi < 30) {
            bodyMass="비만";
        } else {
            bodyMass="고도비만";
        }
    }
}

