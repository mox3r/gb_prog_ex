import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws Exception {
        Product prod = new Product();
        prod.setName("Product N1");
        prod.setBrand("Vasya.inc");
        prod.setPrice(200);

        System.out.println(prod.displayInfo());

        Product prod2 = new Product();
        System.out.println(prod2.displayInfo());

        Product prod3 = new Product("mox3r", "maxiTool", 1080);
        System.out.println(prod3.displayInfo());

        BottleOfMilk milk1 = new BottleOfMilk("ОАО ГМЗ №1", "Славянские традиции", 314, 1.5, 2.5);
        System.out.println(milk1.displayInfo());

        BottleOfWater water1 = new BottleOfWater("ООО Исток", "Вода питьевая №1", 199, 2.5);
        System.out.println(water1.displayInfo());

        BottleOfMilk milk2 = new BottleOfMilk("ОАО ГМЗ №1", "Славянские традиции 1", 254, 0.5, 1);

        BottleOfMilk milk3 = new BottleOfMilk("ОАО ГМЗ №1", "Славянские традиции 2", 300, 1.0, 3.5);

        BottleOfMilk milk4 = new BottleOfMilk("ОАО ГМЗ №1", "Славянские традиции 3", 299, 2.0, 1.5);

        PackageOfTea tea1 = new PackageOfTea("Princess", "Нури", 120, "Черный", 25);
        PackageOfTea tea2 = new PackageOfTea("Princess", "Ява", 170, "Зеленый", 50);
        PackageOfTea tea3 = new PackageOfTea("Princess", "Жасмин", 140, "Бергамот", 25);
        PackageOfTea tea4 = new PackageOfTea("Princess", "Роза", 200, "Каркаде", 100);
        PackageOfTea tea5 = new PackageOfTea("Princess", "Цинь", 250, "Улун", 100);

        ArrayList<Product> products = new ArrayList<>();
        products.add(milk1);
        products.add(milk2);
        products.add(milk3);
        products.add(milk4);
        products.add(tea1);
        products.add(tea2);
        products.add(tea3);
        products.add(tea4);
        products.add(tea5);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfMilk bottleOfMilk = vendingMachine.getBottleOfMilk("Славянские традиции 2", 1.0);
        if (bottleOfMilk == null) {
            System.out.println("Такого молока нет");
        } else {
            System.out.println("Вы купили: ");
            System.out.println(bottleOfMilk.displayInfo());
        }

        PackageOfTea packageOfTea = vendingMachine.getPackageOfTea("Жасмин", "Бергамот", 25);
        if (packageOfTea == null) {
            System.out.println("Такого чая нет");
        } else {
            System.out.println("Вы купили: ");
            System.out.println(packageOfTea.displayInfo());
        }
    }
}
