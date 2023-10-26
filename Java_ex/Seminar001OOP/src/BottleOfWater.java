public class BottleOfWater extends Product {
    //Объем бутли с водой
    private double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    BottleOfWater(String brand, String name, double price, double volume){
        super(brand, name, price);
        this.volume = volume;
    }

    @Override
    public String displayInfo(){
        return String.format("[Бутылка с водой]\n%s - %s - %.2f р.\nОбъём: %.1fл", getBrand(), getName(), getPrice(), getVolume());
    }


}
