package tutorial;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add(4);
        arrayList.add("abc");

        MyArrayList<Object> myArrayList = new MyArrayList<>(new Object[100]);
        myArrayList.add(-2);
        myArrayList.add("false");
        myArrayList.add(100);
        myArrayList.add(false);

        System.out.println("Колличество эл-тов: " + myArrayList.size());

    }
}
