package Task2;

import java.util.Random;

public class EmploeeFabric {

    private static Random random = new Random();

    private static boolean randomWorker() {
        return random.nextBoolean();
    }

    public static Employee generateWorker() {
        String[] names = new String[] { "Андрей", "Анатолий", "Василий", "Кирилл", "Владислав", "Олег", "Сергей",
                "Игнат", "Павел", "Антон" };
        String[] surNames = new String[] { "Иванов", "Петров", "Сидоров", "Аверков", "Марков", "Герцен", "Замятин",
                "Цыпляков", "Кулеш", "Орлов" };

        int salary = random.nextInt(60000, 100000);

        int age = random.nextInt(18,55);
        
        if (randomWorker()) {
            return new Worker(surNames[random.nextInt(surNames.length)],
                    names[random.nextInt(names.length)],age,
                    salary);
        } else {
            return new Freelancer(surNames[random.nextInt(surNames.length)],
                    names[random.nextInt(names.length)], age,
                    salary);
        }

    }

    public static Employee[] generateEmploees(int count) {
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++) {
            workers[i] = generateWorker();
        }
        return workers;
    }

}
