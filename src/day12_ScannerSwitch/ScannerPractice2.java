package day12_ScannerSwitch;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        System.out.println("Enter true or false");
        boolean result = scan.nextBoolean();

        scan.close();
    }
}
