package day52_Map_FunctionalInterface;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class WarmUpTask_UniqueCharacter {
    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        String[] arr = str.split("");

        Map<String,Integer> characters = new TreeMap<>();
        String uniqueCharacters = "";

        for (String eachChar : arr) {

            characters.put(eachChar,Collections.frequency(Arrays.asList(arr) ,eachChar));
            int frequencyOfChar = Collections.frequency(Arrays.asList(arr) ,eachChar);

            if(frequencyOfChar==1){
                uniqueCharacters += eachChar+ " ";
            }
        }

        System.out.println("uniqueCharacters = " + uniqueCharacters);

    }
}
/*
1. Write a program that can find the unique characters from a String

			Ex:
					str = "aabcccdeeeef";

			output:
					{b=1, d=1, f=1}
 */