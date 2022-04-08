package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDuplicates2 {
    public static void main(String[] args) {

        int[] numbers = {1,1,1,1,2,2,2,2,3,3,3,3,4,4,4,5,5,5};
        numbers = removeDuplicates(numbers);
        System.out.println(Arrays.toString(numbers));
    }
    // removes the duplicates from the given array, returns the new array

    public static int [] removeDuplicates (int [] array){
        int [] newArray = {};

        for (int i = 0, j=0; i <array.length ; i++, j++) {

            if (!(ArraysUtility.contains(newArray, array[i]))){
                newArray = ArraysUtility.addElement(newArray, array[i]);

            }
        }
        return newArray;
    }





}
