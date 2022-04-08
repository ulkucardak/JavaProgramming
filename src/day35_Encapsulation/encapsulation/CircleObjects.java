package day35_Encapsulation.encapsulation;

public class CircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(5);

        System.out.println(circle1);

        circle1.setRadius(3);

        System.out.println(circle1);

        System.out.println(circle1.getRadius());
    }
}
