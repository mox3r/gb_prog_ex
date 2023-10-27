public class MainClass {

    public static void main(String[] args) {
        Plate plate = new Plate(70);
        Cat[] cats = {
                new Cat("Barsik", 5),
                new Cat("Myrzik", 7),
                new Cat("Vasiliy", 15),
                new Cat("Rizhik", 3),
                new Cat("Marpha", 8),
                new Cat("Ryze", 4),
                new Cat("Tom", 3),
                new Cat("Lora", 12),
                new Cat("Lazzy", 17)
        };

        for (Cat cat : cats) {
            cat.eat(plate);
        }
        plate.info();

    }
}
