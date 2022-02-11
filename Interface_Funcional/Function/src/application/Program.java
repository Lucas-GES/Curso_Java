package Function.src.application;

import Function.src.entities.Products;
import Function.src.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Products> list = new ArrayList<>();

        list.add(new Products("Tv", 900.00));
        list.add(new Products("Mouse", 50.00));
        list.add(new Products("Tablet", 350.00));
        list.add(new Products("HD Case", 80.00));

        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //List<String> names = list.stream().map(Products::staticUpperCaseName).collect(Collectors.toList());
        //List<String> names = list.stream().map(Products::nonStaticUpperCaseName).collect(Collectors.toList());

        //Function<Products, String> func = p -> p.getName().toUpperCase();

        //List<String> names = list.stream().map(func).collect(Collectors.toList());

        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }

}
