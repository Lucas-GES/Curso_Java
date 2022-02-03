package Exercicio1.src.entities;

public class Rectangle {

    public double width;
    public double height;

    public double area(){
        return this.height * this.width;
    }

    public double perimeter(){
        return 2 * this.height + 2 * width;
    }

    public double diagonal(){
        return Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    }

}
