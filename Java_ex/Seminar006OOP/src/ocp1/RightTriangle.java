package ocp1;

public class RightTriangle implements Shape {
    private int kat1;
    private int kat2;
    private double gip;

    public RightTriangle(int kat1, int kat2) {
        this.kat1 = kat1;
        this.kat2 = kat2;
        this.gip = Math.sqrt(Math.pow(kat1, 2) + Math.pow(kat2, 2));
    }

    public int getKat1() {
        return kat1;
    }

    public int getKat2() {
        return kat2;
    }

    public double getGip() {
        return gip;
    }

    @Override
    public double getArea() {
        return kat1 * kat2 / 2;
    }
}
