package day08_LogicalOperatorsAndIfStatements;

public class NameOfTheMonth {

    public static void main(String[] args) {

       int number1 = 1;

       if (number1==1){
           System.out.println("January");
       }
        if (number1==2){
            System.out.println("February");
        }
        if (number1==3){
            System.out.println("March");
        }
        if (number1==4){
            System.out.println("April");
        }
        System.out.println("---------------------");

        int n= 7; // n==> number of month

        if(n==1 || n==3 || n==5 || n==7 || n==8 || n==10 || n==12){
            System.out.println("31 Days");
        }
        if (n==4 || n==6 || n==9 || n==11){
            System.out.println("30 Days");
        }
        if (n==2){
            System.out.println("28 Days");
        }
        System.out.println("-----------------------------");


        int number = 5; // 1 ~ 12

        boolean has28Days = number == 2; // for the month that has 28 days
        boolean has30Days =  number == 4 || number == 6 || number ==9 || number == 11; // for the months that has 30 days
        boolean has31Days = !has28Days && !has30Days; // if the month does not have 28 days and does not have 30 days


        if(has28Days){ //if the month has 28 days
            System.out.println("28 days");
        }

        if(has30Days){ //if the month has 30 days
            System.out.println("30 days");
        }

        if(has31Days){ // if the month has 31 days
            System.out.println("31 days");
        }





    }
}
/*
1. write a program that can display the name of the month

			number = 1 ~ 12

	2. write a program that can display the name of the day

			number = 1 ~ 7

	3. Write a program that can print the number of days in a month

			Ex:
				number = 1 ~ 12;

			output:
				31 Days


			Hints:
				Months that has 31 days: 1, 3, 5, 7, 8, 10, 12
				Months that has 30 days: 4, 6, 9, 11
				Month that has 28 days: 2
 */