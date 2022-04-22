package day9.Task2;

public class Triangle extends Figure {
    public Triangle(double length1, double length2, double length3, String color) {
        super(color);
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    double length1;
    double length2;
    double length3;

    public double area() {
        double p = (length1 + length2 + length3) / 2;
        double Ploshad = Math.sqrt(p * (p - length1) * (p - length2) * (p - length3));
        return Ploshad;
    }

    ;

    public double perimeter() {
        double Perimetr = length1 + length2 + length3;
        return Perimetr;
    }

    ;
}
