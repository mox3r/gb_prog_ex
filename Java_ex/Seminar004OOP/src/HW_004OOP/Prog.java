package HW_004OOP;

public class Prog {
    public static void main(String[] args) {
        var apple1 = new Apple();
        var apple2 = new Apple();
        var apple3 = new Apple();
        var apple4 = new Apple();
        var apple5 = new Apple();
        var apple6 = new Apple();
        var apple7 = new Apple();
        var apple8 = new Apple();

        var orange1 = new Orange();
        var orange2 = new Orange();
        var orange3 = new Orange();
        var orange4 = new Orange();

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
