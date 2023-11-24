package isp1;

public class Bird {
    private int flySpeed = 40;

    protected boolean canFly = true;

    public boolean isCanFly() {
        return canFly;
    }

    public int getFlySpeed() {
        return flySpeed;
    }

    public void fly() {
        System.out.printf("Птица летит. Скорость %d\n", flySpeed);
    }
}
