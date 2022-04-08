package day27_WrapperClasses;

public class Retrieve {
    public static void main(String[] args) {

        String str = "Wooden1 Spoon2!";
        retrieve(str);


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
}
/*
 Write a program that can retrieve the letters, digits and special characters from the string
		Ex:
			str = "Wooden Spoon!"

		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */