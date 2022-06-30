package day41_Exceptions;

public class Test {
    public static void main(String[] args) {
        //System.out.println(9/0);

        try {
            System.out.println(9/0);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }

        System.out.println(9/3);



    }
}
