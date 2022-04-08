package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class AddElementToArrayOverloading {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        arr = addElement(arr, 5);
        System.out.println(Arrays.toString(arr));

        String [] names = {"ulku", "betul", "murat", "ahmet"};
        names = addElement(names, "mehmet");
        System.out.println(Arrays.toString(names));




    }

    // 1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int [] addElement (int [] array, int element){
        int [] result = new int [array.length + 1];
        int i = 0;
        for (int each : array) {
            result [i++] = each;
        }
        result [array.length] = element;

        return result;
    }

    //2. create a return method called addDouble that can add a double after the last index of a double array

    public static double [] addElement (double [] array, double element){
        double [] result = new double [array.length + 1];
        int i = 0;
        for (double each : array) {
            result [i++] = each;
        }
        result [array.length] = element;

        return result;
    }

    //3. create a return method called addString that can add a String after the last index of a String array
    public static String [] addElement (String [] array, String element){
        String [] result = new String [array.length + 1];
        int i = 0;
        for (String each : array) {
            result [i++] = each;
        }
        result [array.length] = element;

        return result;
    }

    public static char [] addElement (char [] array, char element){
        char [] newArray = new char [array.length+1];
        int i = 0;
        for (char each : array) {
            newArray[i] = each;
            i++;
        }
        newArray [array.length] = element;
        return newArray;
    }
}
