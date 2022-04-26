package day43_Abstraction.shapeTask;

public abstract class Shape {


    private String name;

    public Shape(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.isBlank() || name.isEmpty()){
            throw new RuntimeException("Invalid name!");
        }
        this.name = name;
    }

    public abstract double area();

    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }
}
/*
Shape task:

	Shape:
		name

		Encapsulate the fields

		Add constructor to set the fields

		area()
		perimeter()
		toString(): name, area, perimeter


	Create the following subclasses of Shape and add the aditional features that are needed:

				Rectangle:
					area(): w * l
					perimeter(): 2 * (w+l)

				Square:
					area(): s * s
					perimeter: 4 * s

				Circle:
					area(): r * r * pi
					perimeter(): 2 * r * pi



 */