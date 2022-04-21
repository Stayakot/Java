package day9.Task2;

public class Circle extends Figure{
    public Circle( double radius,String color){
        super(color);
        this.radius=radius;
    }

    double radius;

    public double area(){
        double Ploshad = Math.PI*radius*radius;
        return Ploshad;
    };
    public double perimeter(){
        double Perimetr = 2*radius*Math.PI;
        return Perimetr;
    };
}