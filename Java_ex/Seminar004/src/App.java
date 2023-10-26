import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<String> surname = new ArrayList<>();
        ArrayList<String> firstName = new ArrayList<>();
        ArrayList<String> secondName = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> sex = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите ФИО, возраст, пол (через запятую):");
        System.out.println("Для выхода введите 'exit'");

        LinkedList<Integer> id = new LinkedList<>();

        while (true) {
            String sTmp = scanner.nextLine();
            if (sTmp.equalsIgnoreCase("exit")) {
                break;
            }
            String[] str = sTmp.split(", ");
            String[] str1 = str[0].split(" ");
            surname.add(str1[0]);
            firstName.add(str1[1]);
            secondName.add(str1[2]);
            age.add(Integer.parseInt(str[1]));
            sex.add(str[2].toLowerCase().contains("м"));
            id.add(id.size());
        }
        scanner.close();

        id.forEach(n -> {
            System.out.printf("%s %s.%s.\n",
                    surname.get(n), firstName.get(n).charAt(0), secondName.get(n).charAt(0));
        });

        System.out.println("-".repeat(30));

        id.sort((n1, n2) -> age.get(n1) - age.get(n2));

        id.forEach(n -> {
            System.out.printf("%s %s.%s. %d\n",
                    surname.get(n), firstName.get(n).charAt(0), secondName.get(n).charAt(0), age.get(n));
        });

    }
}
