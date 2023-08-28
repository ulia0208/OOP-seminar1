package task1;

public class Product {
    protected String name;
    protected String brand;
    protected Integer price;


    public Product() {
        this("Noname");
    }
    public Product(String name){
        this(name,"Brand");
    }
    public Product(String name, String brand){
        this(name,brand,100);

    }

    public Product(String name,String brand,Integer price){
        if(price<100) {
            throw new RuntimeException("Некорректная цена товара");
        }
        this.price=price;
//        this.name=name;
//        this.brand=brand;

         checkName(name);
         checkBrand(brand);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    private void checkName(String name) {
        if(name==null||name.length()<3){
            this.name="Noname";
        }
        else {
            this.name=name;
        }
    }

    private void checkBrand(String brand){
        if(brand==null){
            this.brand="NoBrand";
        }

        if (brand.length()<3){
            this.brand="ShortBrand";


        }
        else {
            this.brand=brand;
        }
    }

    public String displayInfo(){
        return String.format("%s - %s - %d", name, brand, price);
    }


}
