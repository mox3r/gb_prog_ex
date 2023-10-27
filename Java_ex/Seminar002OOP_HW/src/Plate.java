public class Plate extends Checker {
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
        PlateChecker(food);
    }
}
