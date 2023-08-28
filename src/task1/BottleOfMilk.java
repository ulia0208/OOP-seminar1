package task1;

public class BottleOfMilk extends Product{
    private double volume;
    private double fat;


    public BottleOfMilk(String name, String brand,Integer price,double volume,double fat){
        super(name,brand,price);
        this.volume=volume;
        this.fat=fat;
    }

    public double getVolume() {
        return volume;
    }

    public double getFat() {
        return fat;
    }

    @Override
    public String displayInfo() {
        return String.format("Молоко %s - %s - %d - volume: %.1f - fat: %.1f", name,brand,price,volume,fat);
    }
}
