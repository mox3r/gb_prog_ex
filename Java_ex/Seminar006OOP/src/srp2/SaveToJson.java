package srp2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveToJson {

    private static int orderCount = 100000;

    private final Order order;

    public SaveToJson(Order order) {
        this.order = order;
    }

    public void saveToJson() {
        orderCount += 1;
        String fName = order.getOrderName() + orderCount + ".json";

        try (FileWriter writer = new FileWriter(fName, false)) {
            writer.write("{\n");
            writer.write("\"clientname\":\"" + order.getClientName() + "\", \n");
            writer.write("\"product\":\"" + order.getProduct() + "\", \n");
            writer.write("\"qnt\":\"" + order.getQnt() + "\", \n");
            writer.write("\"price\":\"" + order.getPrice() + "\"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
