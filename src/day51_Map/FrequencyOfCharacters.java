package day51_Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String str = "bbcccaaaaa";
        String [] arr = str.split("");

        Map<String,Integer> result = new LinkedHashMap<>();

        for (String eachChar : arr) {
            result.put(eachChar, Collections.frequency(Arrays.asList(arr),eachChar));

        }
        System.out.println(result);


    }
}
/*
2. Write a program that can return the frequency of characters
        Not: MUST use map
        Ex: str = "bbcccaaaaa"
        output:
            {b=2, c=3, a=5}
 */