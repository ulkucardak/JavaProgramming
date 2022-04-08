package day15_String_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        for(int i=15; i<=45; i++){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------");

        for(int i=100; i>=50; i--){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("----------------------------------");

        for (int i=1; i<=55; i++){
            if(i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
        System.out.println("------------------------------------");

        for(int i=2; i<=54; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("-----------------------------");

        for (char i = 'a'; i<='z'; i++){
            System.out.print(i+" ");
        }
        System.out.println();

        for (char i = 'Z'; i>='A'; i--){
            System.out.print(i+" ");
        }

        // for (char i=1; i<=40000; i++){
        // it gives 40000 character from the Ascii table
    }
}
