package day22_MultiDimensinolArrays;

public class ReverseSecondWord_InterviewQuestion {
    public static void main(String[] args) {
        String sentence = "I Love Java";
        String [] words = sentence.split(" ");
        String reversedWord = "";
        String newSentence = "";

        for (int i = words[1].length()-1; i>=0 ; i--) {
            reversedWord += words[1].charAt(i);
        }
        System.out.println(reversedWord);
        newSentence = sentence.replace(words[1],reversedWord);
        System.out.println(newSentence);

    }
}
/*

	2. Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java
 */