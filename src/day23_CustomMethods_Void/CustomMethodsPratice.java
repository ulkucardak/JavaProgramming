package day23_CustomMethods_Void;

public class CustomMethodsPratice {

    public static void main(String[] args) {

        helloWorld5Times();
        helloCydeo5Times();
        evenNumbers1To10();



    }

    public static void helloWorld5Times (){

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
    public static void helloCydeo5Times (){
        for (int i = 0; i < 5; i++) {
            System.out.println("HelloCydeo");

        }
    }
    public static void evenNumbers1To10(){
        for (int i = 1; i <=10; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }

        }
    }


}
