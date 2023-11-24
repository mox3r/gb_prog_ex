package srp2;

import java.util.Scanner;

public class InputConsole {
    private final Order order;
    private final Scanner sc = new Scanner(System.in);

    public InputConsole(Order order) {
        this.order = order;
    }

    public void inputFromConsole() {
        order.setClientName(prompt("Имя клиента: "));
        order.setProduct(prompt("Продукт: "));
        order.setQnt(Integer.parseInt(prompt("Количество: ")));
        order.setPrice(Integer.parseInt(prompt("Цена: ")));
    }

    private String prompt(String msg) {
        System.out.println(msg);
        return sc.nextLine();
    }
}
