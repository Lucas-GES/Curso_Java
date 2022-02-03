import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codigoPeca1 = sc.nextInt();
        int numeroPeca1 = sc.nextInt();
        double valorPeca1 = sc.nextDouble();
        sc.nextLine();
        int codigoPeca2 = sc.nextInt();
        int numeroPeca2 = sc.nextInt();
        double valorPeca2 = sc.nextDouble();
        sc.nextLine();
        double total = (valorPeca1 * numeroPeca1) + (valorPeca2 * numeroPeca2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);

        sc.close();
    }

}
