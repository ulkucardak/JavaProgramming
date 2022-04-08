package day08_LogicalOperatorsAndIfStatements;

public class SingleIfStatements {

    public static void main(String[] args) {
        int number = 101;

        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
         */

        boolean evenNumber = number%2 == 0;
        boolean oddNumber = ! evenNumber; // not even number

        if(evenNumber){ // false
            System.out.println(number+" is even number");
        }

        if(oddNumber){// true
            System.out.println(number+" is odd number");
        }


        System.out.println("--------------------------------");

        int n = 200;

        // positive
        if(n > 0){ //if the n is greater than zero, then it's positive
            System.out.println(n+" is positive");
        }

        // negative
        if(n < 0){ // if n is less than zero, then it's negative
            System.out.println(n+" is negative");
        }

        // zero
        if(n == 0) {
            System.out.println(n + " is zero");
        }



        int number1 = 301;

        if (number1%2==0) {

            System.out.println(number1 + " is a even number.");
        }
        if (number1%2!=0){

            System.out.println(number1 + " is a odd number.");
        }
        System.out.println("----------------------------------");

        int n1 = 0;

        if (n1<0) {

            System.out.println(n1 + " is a negative");
        }
        if (n1>0) {

            System.out.println(n1 + " is a positive");
        }

        if ( n1==0){

            System.out.println(n1 + " is zero");
        }
        int x = 10;
        int y = x++;
        System.out.println(y++ + " " + x++ + " " + y);


    }

}
