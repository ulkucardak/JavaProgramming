package day09_IfElseStatemants;

public class MinNumber {
    public static void main(String[] args) {

        int num1 = 300, num2 = 200;

        boolean isMinNum1 = num1<num2;
        boolean isMinNum2 = num2<num1;
        boolean areEqual = num1 ==num2;

        if (isMinNum1) {
            System.out.println(num1 + " is the minumum number.");
        }
        if (isMinNum2) {
            System.out.println(num2 + " is the minumum number.");
        }
        if(areEqual) {
            System.out.println(num1 + " and " + num2 + " are equal.");
        }

    }
}

/*
1. Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				100 is the minimum number


			n1 & n2

			possibility #1: n1 is Min
			possibility #2: n2 is Min
			possibility #3: equal
 */