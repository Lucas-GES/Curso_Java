package src.util;

public class CurrencyConverter {

    public static double iof = 0.06;

    public static double conversor(double priceDollar, double dollar){
        return (dollar * priceDollar * iof) + (dollar * priceDollar);
    }

}
