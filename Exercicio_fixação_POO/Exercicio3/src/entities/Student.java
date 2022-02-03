package Exercicio3.src.entities;

public class Student {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;

    public double finalGrade(){
        return this.nota1 + this.nota2 + this.nota3;
    }

    public String passOrFailed(double finalGrade){
        if(finalGrade >= 60.00){
            return "PASS";
        }else{
            return "FAILED %n" +
            "MISSING " + (60.00 - finalGrade) + " POINTS";
        }
    }

}
