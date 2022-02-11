package src.application;

import src.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List<Employee> list = new ArrayList<>();
            String line = br.readLine();
            while (line != null){
                String[] fields = line.split(",");
                list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = br.readLine();
            }

            Comparator<Employee> comp = (s1, s2) -> s1.getEmail().toUpperCase().compareTo(s2.getEmail().toUpperCase());

            List<Employee> emails = list.stream()
                            .filter(x -> x.getSalary() > salary)
                            .sorted(comp)
                            .collect(Collectors.toList());

            double sumSalary = list.stream()
                            .filter(p -> p.getName()
                            .charAt(0) == 'M')
                            .map(p -> p.getSalary())
                            .reduce(0.0, (x, y) -> x + y);

            for (Employee emp: emails) {
                System.out.println(emp.getEmail());
            }
            System.out.print("Sum of salary of people whose name starts with 'M': " + sumSalary);

        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }

}
