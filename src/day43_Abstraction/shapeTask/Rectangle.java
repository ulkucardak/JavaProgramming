package day43_Abstraction.shapeTask;

public class Rectangle extends Shape{

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        super("Rectangle");
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0){
            throw new RuntimeException("Invalid number for width!");
        }
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<0){
            throw new RuntimeException("Invalid number for height!");
        }
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + getName() + '\'' +
                ", Area of rectangle = " + area() + '\'' +
                ", Perimeter of rectangle = " + perimeter() + '\'' +
                '}';
    }
}
