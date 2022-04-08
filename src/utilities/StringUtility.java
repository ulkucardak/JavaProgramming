package utilities;

import java.util.Arrays;

public class StringUtility {

    //prints each character of the given string
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }


    //reverses the given string and returns the reversed string
    public static String reverse(String str){
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }

        return result;
    }


    //checks if the given String is palindrome, returns boolean
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }


    //checks if the given string is anagram, returns boolean
    public static boolean anagram(String str1, String str2){
        char[] ch1 =str1.toCharArray();
        char[] ch2 =str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1, ch2);
    }


    //removes the duplicates from given string, returns String.
    public static String removeDuplicates(String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if(!result.contains(""+each)){
                result += each;
            }

        }

        return result;
    }

    // Write a program that can retrieve the letters, digits and special characters from the string
    public static void retrieve (String str){
        String letters= "";
        String digits = "";
        String specialChars = "";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if (ch>='0' && ch<='9'){
                digits += ch;
            } else if (ch>='a' && ch<='z' || ch>='A' && ch<='Z'){
                letters += ch;
            } else{
                specialChars += ch;
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }

    // Write program that returns true if the total number of upper case characters are equal to
    //total number of Lowercase characters of a string
    public static boolean isUppercaseEqualsLowercase (String str){
        int numberOfUppercase = 0;
        int numberOfLowercase = 0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                numberOfUppercase++;
            }
            if (Character.isLowerCase(ch)){
                numberOfLowercase++;
            }
        }
        boolean result = numberOfUppercase==numberOfLowercase;
        return result;
    }


}
