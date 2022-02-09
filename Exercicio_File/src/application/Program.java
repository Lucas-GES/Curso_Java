package src.application;

import src.model.entities.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.println("Enter file path: ");
        String file = sc.nextLine();

        File fileOrigin = new File(file);
        String fileFolder = fileOrigin.getParent();

        boolean success = new File(fileFolder + "\\out").mkdir();

        String fileCreation = fileFolder + "\\out\\summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(fileFolder))){

            String itemCsv = br.readLine();
            while(itemCsv != null){

                String[] fields = itemCsv.split(",");
                String name = fields[0];
                double price = Double.parseDouble(fields[1]);
                int quantity = Integer.parseInt(fields[2]);

                list.add(new Product(name, price, quantity));

                itemCsv = br.readLine();

            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileCreation))){

                for (Product item: list){
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();

                }
                System.out.println(fileCreation + " CREATED!");

            }catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }

            sc.close();

        }catch (IOException e){
            System.out.println("Error reading file: " + e.getMessage());
        }

        sc.close();
    }

}
