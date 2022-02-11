package src.application;

import src.entities.Products;
import src.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 900.00));
        list.add(new Products("Mouse", 50.00));
        list.add(new Products("Tablet", 350.00));
        list.add(new Products("HD Case", 80.00));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');

        double sum2 = ps.filteredSum(list, p -> p.getPrice() < 100.00);

        System.out.println("Sum = " + String.format("%.2f", sum));
        System.out.println("Sum2 = " + String.format("%.2f", sum2));

    }

}
