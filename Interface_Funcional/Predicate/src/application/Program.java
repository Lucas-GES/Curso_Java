package Predicate.src.application;

import Predicate.src.entities.Products;
import Predicate.src.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 900.00));
        list.add(new Products("Mouse", 50.00));
        list.add(new Products("Tablet", 350.00));
        list.add(new Products("HD Case", 80.00));

        //list.removeIf(x -> x.getPrice() >= 100);
        //list.removeIf(new ProductPredicate());
        //list.removeIf(Products::staticProductPredicate);
        //list.removeIf(Products::nonstaticProductPredicate);

        double min = 100.0;

        //Predicate<Products> pred = p -> p.getPrice() >= min;

        //list.removeIf(pred);

        list.removeIf(p -> p.getPrice() >= min);

        for(Products p: list){
            System.out.println(p);
        }

    }

}
