import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int inicial = sc.nextInt();
        int finalJ = sc.nextInt();
        int duracao;

        if(inicial < finalJ){
            duracao = inicial - finalJ;
        }else{
            duracao = 24 - inicial + finalJ;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();

    }
}
