package src.application;

import src.entities.Employees;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employees> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("Employee #" + (i+1) +":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employees(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase : ");
        int id = sc.nextInt();
        sc.nextLine();

        Employees emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

        if(emp == null){
            System.out.println("This id does not exist!");
        }else {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Employees e: list){
            System.out.print(e);
        }

        sc.close();
    }

}
