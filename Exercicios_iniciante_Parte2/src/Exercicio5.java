import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double item1 = 4.00;
        double item2 = 4.50;
        double item3 = 5.00;
        double item4 = 2.00;
        double item5 = 1.50;

        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();
        double total;

        if(codigo == 1){
            total = (double) quantidade * item1;
        }else if(codigo == 2){
            total = (double) quantidade * item2;
        }else if(codigo == 3){
            total = (double) quantidade * item3;
        }else if(codigo == 4){
            total = (double) quantidade * item4;
        }else{
            total = (double) quantidade * item5;
        }

        System.out.printf("Total: R$ %.2f%n", total);

        sc.close();

    }

}
