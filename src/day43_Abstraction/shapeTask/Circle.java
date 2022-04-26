package day43_Abstraction.shapeTask;

public class Circle extends Shape{

    private double radius;
    public static double pi = 3.14;

    public Circle( double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<=0){
            throw new RuntimeException("Invalid number for radius!");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * pi;
    }

    @Override
    public double perimeter() {
        return 2 * pi * radius;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + getName() + '\'' +
                ", Area of circle = " + area() + '\'' +
                ", Perimeter of circle = " + perimeter() + '\'' +
                '}';
    }
}
