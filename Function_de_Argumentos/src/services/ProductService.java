package src.services;

import src.entities.Products;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Products> list, Predicate<Products> criteria){
        double sum = 0.0;
        for (Products p: list) {
            if(criteria.test(p)){
                sum += p.getPrice();
            }
        }

        return sum;
    }

}
