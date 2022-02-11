package Consumer.src.entities;

public class Products {

    private String name;
    private Double price;

    public Products(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void staticPriceUpdade(Products p){
         p.setPrice(p.getPrice() * 1.1);
    }

    public void nonstaticPriceUpdade(){
        price = price * 1.1;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name +
                ", price=" + String.format("%.2f",price) +
                '}';
    }
}
