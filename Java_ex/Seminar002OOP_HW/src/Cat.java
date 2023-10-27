public class Cat extends Checker{
    private String name;
    private int appetite;
    private boolean satiety = false;

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate plate) {
        PlateChecker(plate.getFood());
        if (plate.getFood() > 0 && !satiety) {
            System.out.printf("%s is hungry!\n", name);
            if (plate.getFood() - appetite >= 0) {
                plate.setFood(plate.getFood() - appetite);
                System.out.printf("%s full of food!\n", name);
                satiety = true;
            } else {
                System.out.println("I can't eat this.\n");
            }
        }
    }

}
