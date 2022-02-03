import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double PI = 3.14159;
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        sc.nextLine();

        double TRIANGULO = (A * C) / 2;
        double CIRCULO = PI * Math.pow(C, 2);
        double TRAPEZIO = ((A + B) * C) / 2;
        double QUADRADO = Math.pow(B, 2);
        double RETANGULO = A * B;

        System.out.printf("TRIANGULO: %.3f%n", TRIANGULO);
        System.out.printf("CIRCULO: %.3f%n", CIRCULO);
        System.out.printf("TRAPEZIO: %.3f%n", TRAPEZIO);
        System.out.printf("QUADRADO: %.3f%n", QUADRADO);
        System.out.printf("RETANGULO: %.3f%n", RETANGULO);

        sc.close();
    }

}
