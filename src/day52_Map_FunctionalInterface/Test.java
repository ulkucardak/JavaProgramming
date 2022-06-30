package day52_Map_FunctionalInterface;

public class Test {
    public static void main(String[] args) {

        MyFirstFunctionalInterface oddOrEven = (n) -> {
            if(n%2==0){
                System.out.println(n+ " is even number");
        }else{
                System.out.println(n+ " is odd number");
            }
        };

        oddOrEven.apply(21);

        MyFirstFunctionalInterface eligibleAlcohol = (age) -> {
            if(age>=18){
                System.out.println("Eligible to buy Alcohol");
            }else{
                System.out.println("Not eligible to buy Alcohol");
            }
        };

        eligibleAlcohol.apply(17);

        MyFirstFunctionalInterface cubeOfNumber = (n) -> {
            System.out.println(n * n * n);
        };

        cubeOfNumber.apply(4);



    }
}
