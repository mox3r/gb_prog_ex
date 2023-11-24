package isp1;

public class Penguin extends Bird {

    public Penguin() {
        canFly = false;
    }

    @Override
    public void fly() {
        throw new RuntimeException("Пингвин не может в полёт!");
    }

}
