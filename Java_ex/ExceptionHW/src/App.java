import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {
        String date = "dd.mm.yyyy";
        String regex = "\\d+";

        boolean isDigits = false;
        boolean isValidDate = false;
        boolean isSex = false;

        System.out.print("\033[H\033[2J");
        System.out.println("Программа записывает данные в файл \"фамилия\"");

        System.out.println(
                "Введите данные формата: ФИО, дата рождения(dd.mm.yyyy), номер телефона(7xxxxxxxxxx), пол (m/f): ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "cp866"));
        String s = br.readLine();

        String[] str = s.split(" ");

        if (str.length == 6) {
            DateFormat sDateFormat = new SimpleDateFormat(date);
            sDateFormat.setLenient(false);
            try {
                sDateFormat.parse(str[3]);
                isValidDate = true;
            } catch (ParseException e) {
                System.out.println("Неверный формат даты");
                isValidDate = false;
            }

            try {
                isDigits = str[4].matches(regex);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат номера телефона.");
                isDigits = false;
            }

            if (str[5].toLowerCase().equals("m") || str[5].toLowerCase().equals("f")) {
                isSex = true;
            } else {
                System.out.println("Пол указан неверно! Попробуйте f или m.");
            }

            if (isValidDate && isDigits && isSex) {

                String fname = str[0] + ".txt";

                try (FileWriter writer = new FileWriter(fname, true)) {
                    writer.write("<" + str[0] + ">");
                    writer.write("<" + str[1] + ">");
                    writer.write("<" + str[2] + ">");
                    writer.write("<" + str[3] + ">");
                    writer.write("<" + str[4] + ">");
                    writer.write("<" + str[5] + ">\n");
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }

        } else {
            System.out.println("Неверный формат ввода данных");
        }
    }
}
