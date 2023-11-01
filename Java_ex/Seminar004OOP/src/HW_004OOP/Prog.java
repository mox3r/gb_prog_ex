package HW_004OOP;

public class Prog {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Apple apple6 = new Apple();
        Apple apple7 = new Apple();
        Apple apple8 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();

        // тут пока не разобрался как убрать обращение к параметру, конструктор
        // ругается.

        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();

        appleBox1.add(apple1);
        appleBox1.add(apple2);
        appleBox1.add(apple3);
        appleBox2.add(apple4);
        appleBox2.add(apple5);
        appleBox2.add(apple6);
        appleBox2.add(apple7);
        appleBox2.add(apple8);

        orangeBox2.add(orange1);
        orangeBox2.add(orange2);
        orangeBox1.add(orange3);
        orangeBox1.add(orange4);

        System.out.println(appleBox1.compare(appleBox2));
        System.out.println(appleBox1.compare(orangeBox1));

        System.out.println("Ящик 1: " + appleBox1.getWeight() + " Ящик 2: " + appleBox2.getWeight() +
                "\nПеремещаем из второго в первый 2 единицы: ");
        appleBox2.transfer(appleBox1, 2);
        System.out.println("Ящик 1: " + appleBox1.getWeight() + " Ящик 2: " + appleBox2.getWeight() +
                "\nПеремещаем из второго в первый 5 единиц: ");
        appleBox2.transfer(appleBox1, 5);

    }

}
