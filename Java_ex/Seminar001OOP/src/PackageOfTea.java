public class PackageOfTea extends Product {
    private String typeOfTea;

    public String getTypeOfTea() {
        return typeOfTea;
    }

    public void setTypeOfTea(String typeOfTea) {
        this.typeOfTea = typeOfTea;
    }

    private int countOfPacks;

    public int getCountOfPacks() {
        return countOfPacks;
    }

    public void setCountOfPacks(int countOfPacks) {
        this.countOfPacks = countOfPacks;
    }

    PackageOfTea(String brand, String name, double price, String typeOfTea, int countOfPacks) {
        super(brand, name, price);
        this.typeOfTea = typeOfTea;
        this.countOfPacks = countOfPacks;
    }

    @Override
    public String displayInfo() {
        return String.format("[Упаковка чая]: %s - %s - %.2f\nТип: %s, Кол-во пакетиков: %d",
                getBrand(), getName(), getPrice(), getTypeOfTea(), getCountOfPacks());
    }
}
