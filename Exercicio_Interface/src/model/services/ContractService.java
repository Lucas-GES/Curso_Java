package src.model.services;

import src.model.entities.Contract;
import src.model.entities.Installment;

import java.util.Calendar;
import java.util.Date;

public class ContractService {

    private Payment payment;

    public ContractService(Payment payment) {
        this.payment = payment;
    }

    public void processContract(Contract contract, Integer months){
        double basicPayment = contract.getTotalValue() / months; // basicPayment = total value divide by the months, give the Installments per month

        for(int i=1; i<= months; i++){
            double updatedPayment = basicPayment + payment.interest(basicPayment, i);
            double totalPayment = updatedPayment + payment.paymentService(updatedPayment); // totalPayment = takes the payment with the interest and sum with the paymentService applying the updatedPayment
            Date dueDate = nextMonths(contract.getDate(), i);
            contract.getInstallment().add(new Installment(dueDate, totalPayment));
        }

    }

    private Date nextMonths(Date date, int n){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, n);
        return calendar.getTime();
    }
}
