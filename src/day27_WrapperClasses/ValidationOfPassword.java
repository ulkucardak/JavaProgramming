package day27_WrapperClasses;

public class ValidationOfPassword {
    public static void main(String[] args) {
        String password = "31750@U4";
        String result = isPasswordStrong(password);
        System.out.println("result = " + result);


    }
    public static String isPasswordStrong (String password){

        String result = "";
        int upperCase = 0;
        int lowerCase = 0;
        int digit = 0;
        int specialChar = 0;

        if (password.length()>=8 && !(password.contains(" "))){

            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)){
                    upperCase++;
                }
                if(Character.isLowerCase(ch)){
                    lowerCase++;
                }
                if (Character.isDigit(ch)){
                    digit++;
                }
                if (Character.isLetterOrDigit(ch)){
                    specialChar++;
                }
            }
            if (upperCase>=1 && lowerCase>=1 && digit>=1 && specialChar>=1){
                result = "Your password is strong";
            }else{
                result = "Your password is not strong";
            }

        }else{
           result = "Invalid Password!";
        }
        return result;
    }
}
/*
   Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
                1. Password MUST be at least have 8 characters long, and should not contain space
                2. PassWord should at least contain one upper case letter
                3. PassWord should at least contain one lower case letter
                4. Password should at least contain one special characters
                5. Password should at least contain a digit
 */