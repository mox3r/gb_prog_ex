import java.io.FileWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Программа поиска количества простых чисел в заданном числе. Числа запишет в файл.");

        String fname = "result.txt";
        int counter = 0;
        int number;

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для подсчета простых чисел в нем: ");
        number = sc.nextInt();
        sc.close();

        FileWriter writer = new FileWriter(fname, false);
        for (int i = 2; i < number; i++) {
            boolean isPrime = true;
            if (i > 10) {
                if (i % 2 == 0 || i % 10 == 5) {
                    continue;
                }
            }
            for (int j = 2; j <= i / 2; j++) {
                if (j > Math.sqrt(i) + 1) {
                    break;
                }
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                writer.write(i + "\t");
                counter++;
            }
        }
        writer.flush();
        writer.close();
        System.out.printf("\nПростых чисел в числе %d: %d", number, counter);
    }
}
