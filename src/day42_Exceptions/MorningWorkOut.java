package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("------------------------Push Up started-----------------");


       /* for (int i = 1; i <=30 ; i++) {
            System.out.print("\rPush Up "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        for (int i = 1; i <=30 ; i++) {
            System.out.print("\rPush Up "+i);
            sleep(1.5);
        }

        System.out.println("\n--------------------------Push Up completed----------------");

    }

    public static void sleep(double seconds){

        try {
            Thread.sleep((long)(seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
