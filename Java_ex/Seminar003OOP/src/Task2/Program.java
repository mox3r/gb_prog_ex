package Task2;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {

        Employee[] workers = EmploeeFabric.generateEmploees(15); // работники собираются в массив

        Arrays.sort(workers, new SalaryComparator()); // Массивные работники строятся в ряд по з/п
        for (Employee worker : workers) { // Массивные работники представляются
            System.out.println(worker);
        }

        System.out.println("\n" + "*".repeat(30) + "\n");

        Arrays.sort(workers); // Массивы рабочих строятся по имени
        for (Employee worker : workers) { // Массивные работники представляются
            System.out.println(worker);
        }

        System.out.println("\n" + "*".repeat(30) + "\n");

        Arrays.sort(workers, new AgeComparator()); // Массивы рабочих строятся по возрасту
        for (Employee worker : workers) { // Массивные работники представляются
            System.out.println(worker);
        }
    }
}
