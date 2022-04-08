package day05_Concatenation;

public class CarInfo {

    public static void main(String[] args) {

        String year = "2018",
                make = "Toyota",
                model = "Camry",
                miles = "50_000 miles",
                color = "Red",
                price = "$19_000.";

        System.out.println(year + make +  model + ", " + miles + ", " + color + ", " + price);
    }
}
