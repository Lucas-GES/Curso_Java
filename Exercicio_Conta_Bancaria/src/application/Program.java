package src.application;

import src.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountName = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char decision = sc.next().charAt(0);

        if(decision == 'y'){
            System.out.print("Enter initial deposit value: ");
            double deposit = sc.nextDouble();
            account = new Account(accountNumber, accountName, deposit);
        }else{
            account = new Account(accountNumber, accountName);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account);
        System.out.print("Enter a deposit value: ");
        account.depositAccount(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);
        System.out.print("Enter a withdraw value: ");
        account.withdrawAccount(sc.nextDouble());
        System.out.println("Updated account data: ");
        System.out.println(account);



        sc.close();



    }

}
