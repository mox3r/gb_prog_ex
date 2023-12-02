package factory;

import java.util.ArrayList;
import java.util.Random;

public class App {
    static Random rnd = new Random();

    private static Employee generateEmployee(EmployeeType employeeType) {
        String[] names = new String[] { "Андрей", "Анатолий", "Василий", "Кирилл", "Владислав", "Олег", "Сергей",
                "Игнат", "Павел", "Антон" };
        String[] surNames = new String[] { "Иванов", "Петров", "Сидоров", "Аверков", "Марков", "Герцен", "Замятин",
                "Цыпляков", "Кулеш", "Орлов" };
        int salary = rnd.nextInt(200, 500);
        int index = rnd.nextInt(100, 150);

        return switch (employeeType) {
            case Worker -> new Worker(names[rnd.nextInt(names.length)], surNames[rnd.nextInt(surNames.length)],
                    salary * index, rnd.nextInt(25, 51));
            case Freelancer -> new Freelancer(names[rnd.nextInt(names.length)], surNames[rnd.nextInt(surNames.length)],
                    salary, rnd.nextInt(25, 51));
        };
    }

    static Employee generateEmployee() {
        int typeIndex = rnd.nextInt(2);

        return switch (typeIndex) {
            case 0 -> generateEmployee(EmployeeType.Freelancer);
            case 1 -> generateEmployee(EmployeeType.Worker);
            default -> null;
        };
    }

    static ArrayList<Employee> generateEmployees(int count){
        ArrayList<Employee> employees = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            employees.add(generateEmployee());
        }
        return employees;
    }

    public static void main(String[] args) {

        for (Employee e : generateEmployees(50)) {
            System.out.println(e);
        }

    }
}
