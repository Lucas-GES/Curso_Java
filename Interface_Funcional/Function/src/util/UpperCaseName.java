package Function.src.util;

import Function.src.entities.Products;

import java.util.function.Function;

public class UpperCaseName implements Function<Products, String> {

    @Override
    public String apply(Products p) {
        return p.getName().toUpperCase();
    }
}
