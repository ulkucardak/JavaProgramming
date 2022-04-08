package day27_WrapperClasses;

public class UppercaseEqualsLowercase {

    public static void main(String[] args) {
        
        String str = "JAVA javac";
        boolean isUppercaseEqualLowecase = isUppercaseEqualsLowercase(str);
        System.out.println("isUppercaseEqualLowecase = " + isUppercaseEqualLowecase);
        

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
/*
Write program that returns true if the total number of upper case characters are equal to 
total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";

		output:
			true
 */