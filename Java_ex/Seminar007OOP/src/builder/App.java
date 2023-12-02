package builder;

public class App {
    public static void main(String[] args) {
        Order order = new OrderBuilder()
                .setClientName("Andrew")
                .setProductName("box")
                .setPrice(1000)
                .setQnt(1)
                .setSign(true)
                .build();
        System.out.println(order);
    }
}
