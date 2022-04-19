package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Study {
    public static void main(String[] args) {

        String [] arr1 = {"A", "B", "C"};
        String [] arr2 = {"D", "E", "F", "G"};

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            list.add(arr1[i]);
        }
        for (String each : arr2) {
            list.add(each);
        }

        System.out.println(list);

        char [] ch1 = {'a', 'b', 'c'};
        char [] ch2 = {'d', 'e', 'f'};


        ArrayList<Character> list2 = new ArrayList<>();

      Character[] ch3 = new Character[ch1.length];
      Character [] ch4 = new Character[ch2.length];




        for (int i = 0; i < ch1.length; i++) {
            ch3[i] = ch1[i];
        }

        for (int i = 0; i < ch2.length; i++) {
            ch4[i] = ch2[i];
        }

      list2.addAll(Arrays.asList(ch3));
      list2.addAll(Arrays.asList(ch4));

        System.out.println(list2);




    }



}
/*
4. write a program that can combine two String arrays into one arrayList
	            ex:
	                arr1 = {"A", "B", "C"};
	                arr2 = {"D", "E", "F", "G"};
	                list ==> {"A", "B", "C", "D", "E", "F", "G"}

 */