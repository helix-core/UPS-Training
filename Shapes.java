//Abstraction and Inheritance
abstract class Shape {
    String color;

    abstract double area();
    public abstract String toString();

    public Shape(String color)
    {
        this.color = color;
    }
    public String getColor() { return color; }
}
class Circle extends Shape {
    double radius;

    public Circle(String color, double radius)
    {

        super(color);
        this.radius = radius;
    }

    public double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }

    public String toString()
    {
        return "Circle color is " + super.getColor()
            + " and area is : " + area();
    }
}

public class Shapes {
    public static void main(String[] args)
    {
        Shape s1 = new Circle("Blue", 3.2);

        System.out.println(s1.toString());
    }
}
