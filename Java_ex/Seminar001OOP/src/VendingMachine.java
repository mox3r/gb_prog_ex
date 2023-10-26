import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfMilk getBottleOfMilk(String name, double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfMilk) {
                BottleOfMilk bottleOfMilk = (BottleOfMilk) product;
                if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume) {
                    return bottleOfMilk;
                }
            }
        }
        return null;
    }

    public PackageOfTea getPackageOfTea(String name, String typeOfTea, int countOfPacks) {
        for (Product product : products) {
            if (product instanceof PackageOfTea) {
                PackageOfTea packageOfTea = (PackageOfTea) product;
                if (packageOfTea.getName().equals(name) && packageOfTea.getTypeOfTea().equals(typeOfTea)
                        && packageOfTea.getCountOfPacks() == countOfPacks) {
                    return packageOfTea;
                }
            }
        }
        return null;
    }

}
