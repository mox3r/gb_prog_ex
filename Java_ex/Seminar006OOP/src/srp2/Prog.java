package srp2;

public class Prog {
    public static void main(String[] args) {
        Order order = new Order();
        InputConsole ic = new InputConsole(order);
        SaveToJson sjson = new SaveToJson(order);

        ic.inputFromConsole();
        sjson.saveToJson();

        ic.inputFromConsole();
        sjson.saveToJson();
    }
}
