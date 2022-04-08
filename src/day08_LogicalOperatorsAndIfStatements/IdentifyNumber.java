package day08_LogicalOperatorsAndIfStatements;

public class IdentifyNumber {

    public static void main(String[] args) {
        int number = 200;
        boolean isNumberPositive = number >0;
        boolean iNegative = number < 0;
        boolean isZero = number == 0;

        System.out.println(number + " is a positive number : " + isNumberPositive );
        System.out.println(number + " is a negative number : " + iNegative );
        System.out.println(number + " is a zero : " + isZero);

    }

}
/*
1. Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

			Ex:
				number = 200

			output:
		        200 is positive number: true
		        200 is negative number: false
		        200 is zero: false
 */