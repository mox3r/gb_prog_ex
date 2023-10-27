public class Plate {
    private int food;

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.printf("Plate: %d", food);
        if (food <= 0) {
            System.out.println("Plate is empty!");
        }
    }
}
