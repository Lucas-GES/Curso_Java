package src.application;

import src.model.entities.Account;
import src.model.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, limit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble();
            acc.withdraw(withdraw);
            System.out.print("New balance: " + String.format("%.2f",acc.getBalance()));
        }catch (WithdrawException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }


    }

}
