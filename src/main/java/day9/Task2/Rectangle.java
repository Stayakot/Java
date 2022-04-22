package day9.Task2;

public class Rectangle extends Figure {
    public Rectangle(double length, double breath, String color) {
        super(color);
        this.length = length;
        this.breath = breath;
    }

    public double length;
    public double breath;

    public double area() {
        double Ploshad = length * breath;
        return Ploshad;
    }



    public double perimeter() {
        double Perimetr = 2 * (length + breath);
        return Perimetr;
    }

    ;
}
