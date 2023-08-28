package task1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Product product1 = new Product();
//        product1.name="Product1";
//        product1.brand="Brand1";
//        product1.price=10;

        System.out.println(product1.displayInfo());


        Product product2 = new Product(null,"Brand2",300);
        System.out.println(product2.displayInfo());
        product2.setPrice(400);


        Integer price= product1.getPrice();


        Product product3=new Product("Product3");
        System.out.println(product3.displayInfo());






        Product bottleOfMilk1=
                new BottleOfMilk("botMilk1", "ooo milk", 350, 1.5,1.5);

       // BottleOfMilk bottleOfMilk2=new BottleOfMilk("botM2", "ooo cow", 250, 1.0,2.5);

        System.out.println("m - "+bottleOfMilk1.displayInfo());
        //System.out.println("m - "+bottleOfMilk2.displayInfo());


        Product bottleOfWater1=
                new BottleOfWater("botWat","ooo aqua", 200, 1.5);
        System.out.println("w - "+bottleOfWater1.displayInfo());


        Product bottleOfWater2=
                new BottleOfWater("botWat","ooo AquaMinerale", 260, 1.5);
        System.out.println("w - "+bottleOfWater2.displayInfo());


        Product bottleOfWater3=
                new BottleOfWater("botWat","ooo BonAqua", 240, 0.5);
        System.out.println("w - "+bottleOfWater3.displayInfo());

        List<Product>products=new ArrayList<>();

        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);

        VendingMachine vendingMachine=new VendingMachine(products);

        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("botWat",1.5);
        if(bottleOfWater!=null){
            System.out.println("Вы получилили воду ");
            System.out.println(bottleOfWater.displayInfo());

        }
        else {
            System.out.println("Нет такой воды");
        }

        Product chocolate1=new Chocolate("KitKat", "Nestle", 160, 650);
        Product chocolate2=new Chocolate("Nestle", "Nestle", 170, 420);
        Product chocolate3=new Chocolate("AlpenGold", "KraftFoods", 180, 450);
        Product chocolate4=new Chocolate("Nesquik", "Nestle", 160, 500);
        Product chocolate5=new Chocolate("Milka", "KraftFoods", 200, 680);
        Product chocolate6=new Chocolate("Bounty", "Mars", 180, 430);
        Product chocolate7=new Chocolate("Mars", "Mars", 160, 550);
        Product chocolate8=new Chocolate("Snickers", "Mars", 170, 460);

        products.add(chocolate1);
        products.add(chocolate2);
        products.add(chocolate3);
        products.add(chocolate4);
        products.add(chocolate5);
        products.add(chocolate6);
        products.add(chocolate7);
        products.add(chocolate8);

        Chocolate chocolate=vendingMachine.getChocolate("Nestle",500 );
        if (chocolate!=null){
            System.out.println("Получили шоколадку ");
            System.out.println(chocolate.displayInfo());
        }
        else {
            System.out.println("Нет такой шоколадки");
        }

        System.out.println("sh - "+chocolate1.displayInfo());






    }
}
