package day35_Encapsulation.encapsulation;

public class Circle {

    private int radius;

    public static double pi = 3.14;

    public Circle(int radius) {
        setRadius(radius);
    }

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        if(radius <= 0 ){
            return;
        }
        this.radius = radius;
    }

    public double calcArea(){
        double area = pi * radius * radius;
        return area;
    }

    public double calcPerimeter(){
        double perimeter = 2 * pi * radius;
        return perimeter;
    }

    public String toString() {
        return "Circle{" +
                "radius = " + radius + " "+
                "Area of Circle = " + calcArea() +" "+
                "Perimeter of Circle = " + calcPerimeter() +
                '}';
    }
}
/*
2. Create a class named Circle

			privtae variables:
				radius

			public variable:
				pi

		 	Encapsulate all the private fields

		 			1. radius of the circle can not be zero or negative

 			Add a constructor that can set the raidus of coircle when circle object is created

 			Methods:
 				calcArea()
 				calcPerimeter()
 				toString()

 */