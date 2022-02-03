import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] main){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();

        if (x < 0.0 || x > 100.0){
            System.out.println("Fora de Intervalo");
        }else if(x <= 25.0){
            System.out.println("Intervalo (0,25]");
        }else if(x <= 50.0){
            System.out.println("Intervalo (25,50]");
        }else if(x <= 75.0){
            System.out.println("Intervalo (50,75]");
        }else {
            System.out.println("Intervalo (75,100]");
        }

        sc.close();
    }

}
