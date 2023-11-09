package entities;

public class Product {
   public  String name;
    public Double price;
   
    public Product() {
    }
   
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }
   
    
    /** 
     * @return String
     */
    public String getName() {
        return name;
    }
   
    
    /** 
     * @return Double
     */
    public Double getPrice() {
        return price;
    }
   
    public void setName(String name) {
        this.name = name;
    }
   
    public void setPrice(Double price) {
        this.price = price;
    }
    
    public  String priceTag(){

        return "New - "+ name + " " + price.toString();
    }
}
