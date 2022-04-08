package day15_String_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {


            int sum=0;
        for (int i = 0; i <=100 ; i++) {
            sum += i;
        }
        System.out.println(sum);


        System.out.println("------------------------------");

        Scanner scan = new Scanner(System.in);

        int total = 0;

        for(int i=1; i<=5; i++){
            System.out.println("Enter a number");
            total += scan.nextInt();

        }
        System.out.println("total = " + total);
    }
}
