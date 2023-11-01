package HW_004OOP;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> fruits = new ArrayList<>();

    public float getWeight() {
        if (fruits.isEmpty())
            return 0;
        else
            return fruits.get(0).getWeight() * fruits.size();
    }

    public boolean compare(Box<?> box) {
        return getWeight() == box.getWeight();
    }

    public void add(T fruit) {
        fruits.add(fruit);
    }

    public void transfer(Box<T> toBox, int quantity) {
        if (fruits.size() < quantity)
            System.out.println("Это сделать нельзя.");
        else
            for (int i = 0; i < quantity; i++) {
                toBox.add(fruits.get(fruits.size() - 1));
                fruits.remove(fruits.size() - 1);
            }
    }
}
