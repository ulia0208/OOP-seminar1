package task1;

public class Chocolate extends Product{
    private Integer calories;

    public Chocolate(String name, String brand, Integer price, Integer calories) {
        super(name, brand, price);
        this.calories = calories;
    }

    public Integer getCalories() {
        return calories;
    }



    @Override
    public String displayInfo() {
        return String.format("Шоколад %s - %s - %d - calories: %d", name,brand,price,calories);
    }
}
