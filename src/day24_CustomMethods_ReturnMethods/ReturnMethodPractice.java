package day24_CustomMethods_ReturnMethods;

public class ReturnMethodPractice {
    public static void main(String[] args) {
        // multiply the max number by 2
        int max = maxNumber(12,34);

        int result = max * 2;

        System.out.println("result = " + result);

    }

    // find the max number between 100 & 200

    public static int maxNumber (int num1, int num2){

        int maxNumber = 0;

       if(num1>num2){
           maxNumber=num1;
       }else{
           maxNumber=num2;
       }
        return maxNumber;
    }









}
