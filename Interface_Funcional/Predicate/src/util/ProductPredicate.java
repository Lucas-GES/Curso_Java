package Predicate.src.util;

import Predicate.src.entities.Products;

import java.util.function.Predicate;

public class ProductPredicate implements Predicate<Products> {
    @Override
    public boolean test(Products p) {
        return p.getPrice() >= 100.00;
    }
}
