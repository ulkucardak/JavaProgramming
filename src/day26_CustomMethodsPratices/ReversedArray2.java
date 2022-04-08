package day26_CustomMethodsPratices;

import utilities.ArraysUtility;

public class ReversedArray2 {

    public static int[] reverse(int[] array){

        int[] result = {};

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }

        return result;
    }
}
