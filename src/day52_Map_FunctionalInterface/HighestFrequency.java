package day52_Map_FunctionalInterface;

import java.util.*;

public class HighestFrequency {
    public static void main(String[] args) {

        String  str = "eeeeeaaabbbbccccdd";

        String[] arr = str.split("");

        Map<String,Integer> characters = new HashMap<>();

        for (String eachChar : arr) {
            characters.put(eachChar, Collections.frequency(Arrays.asList(arr),eachChar));
        }
        Set<Map.Entry<String, Integer>> entries = characters.entrySet();

        int maxFrequency = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> pair : entries) {
            if(pair.getValue()>maxFrequency){
                maxFrequency = pair.getValue();
            }
        }

        for (Map.Entry<String, Integer> pair : entries) {
            if(pair.getValue() == maxFrequency){
                System.out.println(pair.getKey() + " has the max frequency which is "+ maxFrequency);
            }

        }
       


    }
}
/*
Write a program that can find the character that has the highest frequency in a String
        Note: Must use a map

        Ex:
            str = "eeeeeaaabbbbccccdd"

        Output:
            {e=5, a=3, b=4, c=4, d=2 }
            character e has the highest frequency

 */