package day26_CustomMethodsPratices;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};

        int [] mergedArray = merge(arr1, arr2);

        System.out.println(Arrays.toString(mergedArray));

    }

    public static int[] merge (int[] arr1, int [] arr2){
        int [] merged = {};

        for (int each : arr1) {
            merged = ArraysUtility.addElement(merged, each);
        }
        for (int each : arr2) {
            merged = ArraysUtility.addElement(merged, each);
        }
        return merged;
    }
}
