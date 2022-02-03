import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int NumeroFuncionario = sc.nextInt();
        sc.nextLine();
        int Salario = sc.nextInt();
        sc.nextLine();
        double HorasTrabalhadas = sc.nextDouble();
        sc.nextLine();
        double SalarioFinal = (double) HorasTrabalhadas * Salario;
        System.out.println("NUMBER = " + NumeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", SalarioFinal);

        sc.close();
    }
}
