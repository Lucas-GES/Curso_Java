package src.model.services;

public class PaypalService implements Payment{

    @Override
    public Double paymentService(double amount) {
        return amount * 0.02;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return 0.01 * amount * months;
    }
}
