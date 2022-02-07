package src.application;

import src.model.entities.Pessoa;
import src.model.entities.PessoaFisica;
import src.model.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i=1; i<=n; i++){
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char awnser = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();
            if (awnser == 'i'){
                System.out.print("Health expenditures: ");
                double health = sc.nextDouble();
                list.add(new PessoaFisica(name, anualIncome, health));
            }else{
                System.out.print("Number of employees: ");
                int employees = sc.nextInt();
                list.add(new PessoaJuridica(name, anualIncome, employees));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double totalTaxes = 0.0;
        for(Pessoa pessoa : list){
            System.out.println(pessoa.getName() + ": $ " + String.format("%.2f",pessoa.imposto()));
            totalTaxes += pessoa.imposto();
        }
        System.out.println();
        System.out.printf("TOTAL TAXES: $ %.2f%n", totalTaxes);
    }

}
