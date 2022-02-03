package Exercicio3.src.application;

import Exercicio3.src.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.nome = sc.nextLine();
        student.nota1 = sc.nextDouble();
        student.nota2 = sc.nextDouble();
        student.nota3 = sc.nextDouble();
        double notaFinal = student.finalGrade();

        System.out.printf("FINAL GRADE = %.2f%n", notaFinal);
        System.out.printf(student.passOrFailed(notaFinal));


    }

}
