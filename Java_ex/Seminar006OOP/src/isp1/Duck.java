package isp1;

public class Duck extends Bird {
    private int flySpeed = 55;

    @Override
    public void fly() {
        System.out.printf("Утка летит. Скорость %d\n", flySpeed);
    }

}
