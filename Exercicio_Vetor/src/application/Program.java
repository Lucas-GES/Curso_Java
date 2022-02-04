package src.application;

import src.entities.Hotel;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Hotel[] hotels = new Hotel[9];
        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("Rent #" + (i+1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int roomNumber = sc.nextInt();
            hotels[roomNumber] = new Hotel(name, email);
            sc.nextLine();
        }

        System.out.println();
        System.out.println("Busy rooms: ");
        for (int i=0; i< hotels.length; i++){
            if(hotels[i] != null){
                System.out.println(i + ": " + hotels[i].toString());
            }
        }



        sc.close();

    }

}
