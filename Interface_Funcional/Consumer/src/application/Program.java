package Consumer.src.application;

import Consumer.src.util.PriceUpdate;
import Consumer.src.entities.Products;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 900.00));
        list.add(new Products("Mouse", 50.00));
        list.add(new Products("Tablet", 350.00));
        list.add(new Products("HD Case", 80.00));

        //list.forEach(new PriceUpdate());
        //list.forEach(Products::staticPriceUpdade);
        //list.forEach(Products::nonstaticPriceUpdade);

        double factor = 1.1;

        // Consumer<Products> cons = p -> p.setPrice(p.getPrice() * factor);
        //list.forEach(cons);

        list.forEach(p -> p.setPrice(p.getPrice() * factor));
        list.forEach(System.out::println);
    }

}
