package src.model.services;

public interface Payment {

    Double paymentService(double amount);
    Double interest(Double amount, Integer months);

}
