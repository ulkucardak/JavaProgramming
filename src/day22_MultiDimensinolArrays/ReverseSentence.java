package day22_MultiDimensinolArrays;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String sentence = "Today is a good day to learn Java";
        String reversedSentence = " ";

        String [] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String [] reversed = new String [words.length];
        int j = 0;

        for (int i = words.length-1; i>=0; i--) {
            reversed [j] = words[i];
            j++;

        }
        System.out.println(Arrays.toString(reversed));

        for (String each : reversed) {
            reversedSentence += each+ " ";
        }
        System.out.println(reversedSentence);


    }
}
/*
1. Write a program that can reverse a sentence
			Ex:
				sentence = "Today is a good day to learn Java";

			output:
				Java learn to day good a is Today
 */