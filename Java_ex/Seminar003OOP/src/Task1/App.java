package Task1;
public class App {
    public static void main(String[] args) throws Exception {
        Animal[] animals = {
                new Cat("Барсик", 1000, 0),
                new Cat("Рыжик", 700, 0),
                new Cat("Листик", 900, 0),
                new Dog("Шарик", 1100, 50),
                // new Dog("Бобик", 900, 150),
                new Dog("Полкан", 1500, 250)
        };

        for (Animal a : animals) {
            a.run(100);
            a.swim(50);
            a.run(200);
            a.swim(20);
            a.run(500);
            a.swim(0);
            a.run(55);
            a.swim(10);
            a.run(1000);
            a.swim(200);
        }

        System.out.printf("Участвовало: %d животных. (%d котов и %d собак)\n", Animal.getCounter(),
                Cat.getCounter(), Dog.getCounter());
    }
}
