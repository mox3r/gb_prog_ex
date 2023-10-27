public abstract class Checker {
    protected void PlateChecker(int food) {
        if (food <= 0) {
            System.out.println("Plate is empty! Please, fill it!");
        }
    }
}
