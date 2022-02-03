import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double PI = 3.14159;
        double A = PI * Math.pow(raio, 2);

        System.out.printf("A= %.4f%n", A);

        sc.close();
    }

}
