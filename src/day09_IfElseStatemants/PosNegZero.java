package day09_IfElseStatemants;

import java.util.Scanner;

public class PosNegZero {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number =scan.nextInt();
        if (number>0){
        System.out.println(number + " is pozitive");
        }else if (number<0){
        System.out.println(number + " is negative");
    }else{
        System.out.println(number + " is zero");
    }


    }
}
