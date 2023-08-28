package task1;

public class BottleOfWater extends Product {

    private double volume;

    public BottleOfWater(String name, String brand,Integer price,double volume){
        super(name,brand,price);
        this.volume=volume;
    }

    public double getVolume() {
        return volume;
    }

    @Override
    public String displayInfo() {
        return String.format("Вода %s - %s - %d - v:%.1f", name,brand,price,volume);
    }
}
