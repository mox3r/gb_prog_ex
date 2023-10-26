public class Product {
    protected String name;
    protected String brand;
    protected double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    Product(String name, double price) {
        this("<brandName>", name, price);

    }

    Product() {
        name = "<name>";
        brand = "<brand>";
        price = 100;

    }

    Product(String brand, String name, double price) {
        checkName(name);
        checkBrand(brand);
        checkPrice(price);

    }

    private void checkPrice(double price) {
        if (price < 100) {
            this.price = 100;
        } else {
            this.price = price;
        }
    }

    private void checkBrand(String brand) {
        if (brand == null || brand.length() < 2) {
            name = "<brand>";
        } else {
            this.brand = brand;
        }
    }

    private void checkName(String name) {
        if (name == null || name.length() < 2) {
            name = "<name>";
        } else {
            this.name = name;
        }
    }

    public String displayInfo() {
        return String.format("%s - %s - %.2f p.", brand, name, price);
    }
}
