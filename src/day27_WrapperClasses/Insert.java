package day27_WrapperClasses;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Insert {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        arr = insert(arr, 2, 100);
        System.out.println(Arrays.toString(arr));

        char [] arr2 = {'a', 'b', 'c', 'd'};
        arr2 = insert(arr2, 3,'e');

        System.out.println(Arrays.toString(arr2));


    }
    // Create a method inserts the given element to the given index of the array and returns the new array
    public static int [] insert (int [] array, int index, int element){

        int [] newArray = new int [array.length+1];
        for (int i = 0, j=0; i <array.length ; i++,j++) {
            if (j == index){
                newArray [index] = element;
                newArray [index+1] = array [index];
            } else if (j>index){
                newArray [j+1] = array[i];
            } else {
                newArray [j] = array [i];
            }
        }

        return newArray;
    }
    // Create a method inserts the given element to the given index of the array and returns the new array
    public static double [] insert (double [] array, int index, double element){
        double [] newArray = new double [array.length+1];
        for (int i = 0, j=0; i <array.length ; i++,j++) {
            if (j == index){
                newArray [index] = element;
                newArray [index+1] = array [index];
            } else if (j>index){
                newArray [j+1] = array[i];
            } else {
                newArray [j] = array [i];
            }
        }

        return newArray;
    }
    // Create a method inserts the given element to the given index of the array and returns the new array
    public static char [] insert (char [] array, int index, char element){
        char [] newArray = new char [array.length+1];
        for (int i = 0, j=0; i <array.length ; i++,j++) {
            if (j == index){
                newArray [index] = element;
                newArray [index+1] = array [index];
            } else if (j>index){
                newArray [j+1] = array[i];
            } else {
                newArray [j] = array [i];
            }
        }

        return newArray;
    }

    // Create a method inserts the given element to the given index of the array and returns the new array
    public static String [] insert (String [] array, int index, String element){
        String [] newArray = new String [array.length+1];
        for (int i = 0, j=0; i <array.length ; i++,j++) {
            if (j == index){
                newArray [index] = element;
                newArray [index+1] = array [index];
            } else if (j>index){
                newArray [j+1] = array[i];
            } else {
                newArray [j] = array [i];
            }
        }

        return newArray;
    }

}
/*
1.1 Create a method named insert that passes three parameters: integer array, integer index, integer element.
the method inserts the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};

					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}


		1.2 Create the same function for double array, char array and string array
 */