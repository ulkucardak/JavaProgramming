package utilities;

public class MathUtility {
    public static void main(String[] args) {

        int n = 20;
        int m = 23;
        int squareOfNumber = square(2);
        System.out.println("squareOfNumber = " + squareOfNumber);
        
       boolean isEvenNumber = isEvenNumber(n);
        System.out.println("isEvenNumber = " + isEvenNumber);

        int maxNumber = maxNumber(n,m);
        System.out.println("maxNumber = " + maxNumber);
        
        double a = 1.2;
        double b = 2.3;
        double maxNum = maxNumber(a,b);
        System.out.println("maxNum = " + maxNum);

    }
    
    
    
    // Create a method that can return the square of an integer
    public static int square (int num){
        int result = num * num;
        return result;
    }
    // Create a method that can return the square of a double
    public static double square (double num){
        double result = num * num;
        return result;
    }
    
    // Create a method that can return the cube of an integer
    public static int cube (int num){
        int result = num * num * num;
        return result;
    }
    // Create a method that can return the cube of a double
    public static double cube (double num){
        double result = num * num * num;
        return result;
    }
    
    // Create a method that can return the sum of two integers
    public static int sum (int num1, int num2){
        int result = num1 + num2;
        return result;
    }
    // Create a method that can return the sum of two decimals
    public static double sum (double num1, double num2){
        double result = num1 + num2;
        return result;
    }
    // Create a method that can return the subtraction of two integers
    public static int subtraction (int num1, int num2){
        int result = num1 - num2;
        return result;
    }
    // Create a method that can return the subtraction of two decimals
    public static double subtraction (double num1, double num2){
        double result = num1 - num2;
        return result;
    }
    // Creata a method that can return the multiplication of two integers
    public static int multiplication (int num1, int num2){
        int result = num1 * num2;
        return result;
    }
    // Creata a method that can return the multiplication of two decimals
    public static double multiplication (double num1, double num2){
        double result = num1 * num2;
        return result;
    }
    // Create a method that passes two double parameters and return the division result
    public static double division (double num1, double num2){
        double result = num1 / num2;
        return result;
    }
    // Create a method that can check if an integer is even number
    public static boolean isEvenNumber (int num){
        boolean result =false;
        if(num%2==0){
            result = true;
        }
        return result;
        
    }
    //  Create a method that can check if an integer is odd number
    public static boolean isOddNumber (int num){
        boolean result =false;
        if(num%2!=0){
            result = true;
        }
        return result;

    }
    
    // Create a method that can return the maximum number between two integers
    public static int maxNumber (int num1, int num2){
        int max = 0;
        if(num1>num2){
            max = num1;
        }else{
            max = num2;
        }
        return max;
    }
    
    // Create a method that can return the maximum number between two decimal numbers
    public static double maxNumber (double num1, double num2){
        double max = 0;
        if(num1>num2){
            max = num1;
        }else{
            max = num2;
        }
        return max;
    }
    
    // Create a method that can return the minimum number between two integers
    public static int minNumber (int num1, int num2){
        int min = 0;
        if(num1<num2){
            min = num1;
        }else{
            min = num2;
        }
        return min;
    }

    // Create a method that can return the minimum number between two decimals
    public static double minNumber (double num1, double num2){
        double min = 0;
        if(num1<num2){
            min = num1;
        }else{
            min = num2;
        }
        return min;
    }








}

