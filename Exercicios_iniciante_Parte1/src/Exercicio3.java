import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        sc.nextLine();
        int B = sc.nextInt();
        sc.nextLine();
        int C = sc.nextInt();
        sc.nextLine();
        int D = sc.nextInt();
        sc.nextLine();

        int DIFERENCA = (A*B) - (C*D);
        System.out.println("DIFERENCA = " + DIFERENCA);

        sc.close();
    }
}
