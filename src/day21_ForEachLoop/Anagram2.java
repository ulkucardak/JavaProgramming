package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram2 {
    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "slient";

        char[] ch1 = word1.toCharArray();
        char[] ch2 = word2.toCharArray();

        //System.out.println(Arrays.toString(ch1));
        //System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //System.out.println(Arrays.toString(ch1));
        //System.out.println(Arrays.toString(ch2));

        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println(anagram);
    }
}
