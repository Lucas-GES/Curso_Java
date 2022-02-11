package Consumer.src.util;

import Consumer.src.entities.Products;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Products> {

    @Override
    public void accept(Products p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
