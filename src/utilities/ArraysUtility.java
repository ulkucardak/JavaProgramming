package utilities;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysUtility {

    //prints each integer of an integer array in separate lines
    public static void printEachElement(int[] array){
        for (int each : array) {
            System.out.println(each);
        }
    }


    //prints each double of double array in separate lines
    public static void printEachElement(double[] array){
        for (double each : array) {
            System.out.println(each);
        }
    }


    //prints each char of char array in separate lines
    public static void printEachElement(char[] array){
        for (char each : array) {
            System.out.println(each);
        }
    }


    //prints each String of String array in separate lines
    public static void printEachElement(String[] array){
        for (String each : array) {
            System.out.println(each);
        }
    }


    //returns the maximum number from integer array
    public static int max(int[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }


    //returns the maximum number from double array
    public static double max(double[] numbers){
        Arrays.sort(numbers);
        return numbers[numbers.length-1];
    }



    //returns the minimum number from integer array
    public static int min(int[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }


    //returns the minimum number from double array
    public static double min(double[] numbers){
        Arrays.sort(numbers);
        return numbers[0];
    }




    //checks if the given integer is contained in the given array. returns boolean.  contains(int[], int)
    public static boolean contains(int[] array, int element){

        boolean result = false;

        for (int each : array) {
            if(each == element){ // if any array's element is matching with the given element, it means the given elements is contained in the array
                result = true;
            }
        }

        return result;
    }


    //checks if the given double is contained in the given array. returns boolean.
    public static boolean contains(double[] array, double element){

        boolean result = false;

        for (double each : array) {
            if(each == element){
                result = true;
            }
        }

        return result;
    }


    //checks if the given char is contained in the given array. returns boolean.
    public static boolean contains(char[] array, char element){

        boolean result = false;

        for (char each : array) {
            if(each == element){
                result = true;
            }
        }

        return result;
    }


    //checks if the given String is contained in the given array. returns boolean.
    public static boolean contains(String[] array, String element){

        boolean result = false;

        for (String each : array) {
            if( each.equals(element) ){
                result = true;
            }
        }

        return result;
    }



    
    // 1. create a method that can merge two integer arrays.
    public static int [] merger (int [] arr1, int [] arr2){
        int [] merged = new int [arr1.length + arr2.length];

        for (int i = 0, j=0; i <arr1.length ; i++, j++) {
            merged [j] = arr1 [i];
        }
        for (int i = 0, j = arr1.length; i <arr2.length ; i++,j++) {
            merged [j] = arr2 [i];
        }
        return merged;
    }

    // 2. create a method that can merge two double arrays.
    public static double [] merger (double [] arr1, double [] arr2){
        double [] merged = new double [arr1.length + arr2.length];

        for (int i = 0, j=0; i <arr1.length ; i++, j++) {
            merged [j] = arr1 [i];
        }
        for (int  i = 0, j = arr1.length; i <arr2.length ; i++,j++) {
            merged [j] = arr2 [i];
        }
        return merged;
    }

    // 3. create a method that can merge two char arrays.
    public static char [] merger (char [] arr1, char [] arr2){
        char [] merged = new char [arr1.length + arr2.length];

        for (int i = 0, j=0; i <arr1.length ; i++, j++) {
            merged [j] = arr1 [i];
        }
        for (int  i = 0, j = arr1.length; i <arr2.length ; i++,j++) {
            merged [j] = arr2 [i];
        }
        return merged;
    }


    // 4. create a method that can merge two String arrays.
    public static String [] merger (String [] arr1, String [] arr2){
        String [] merged = new String [arr1.length + arr2.length];

        for (int i = 0, j=0; i <arr1.length ; i++, j++) {
            merged [j] = arr1 [i];
        }
        for (int  i = 0, j = arr1.length; i <arr2.length ; i++,j++) {
            merged [j] = arr2 [i];
        }
        return merged;
    }




    //  create a method that can return the max number from an integer array
    public static int maxNumber (int [] array){

        int max = array [0];
        for (int each : array) {

            if(each>max){
                max = each;
            }
        }
        return max;
    }

    //  create a method that can return the max number from double array
    public static double maxNumber (double [] array){

        double max = array [0];
        for (double each : array) {

            if(each>max){
                max = each;
            }
        }
        return max;
    }

    // create a method that can return the max number from long array
    public static long maxNumber (long [] array){

        long max = array [0];
        for (long each : array) {

            if(each>max){
                max = each;
            }
        }
        return max;
    }
    
    
    //  create a method that can return the max number from short array
    public static short maxNumber (short [] array){

        short max = array [0];
        for (short each : array) {

            if(each>max){
                max = each;
            }
        }
        return max;
    }


    // create a method that can return the max number from float array
    public static float maxNumber (float [] array){

        float max = array [0];
        for (float each : array) {

            if(each>max){
                max = each;
            }
        }
        return max;
    }


    // create a method that can return the max number from byte array
    public static byte maxNumber (byte [] array){

        byte max = array [0];
        for (byte each : array) {

            if(each>max){
                max = each;
            }
        }
        return max;
    }



    // 1. create a return method called addInteger that can add an Integer  after the  last index of an integer array
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



    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(int[] array, int element){
        int count = 0;
        for (int each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(double[] array, double element){
        int count = 0;
        for (double each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(char[] array, char element){
        int count = 0;
        for (char each : array) {
            if(each == element){
                count++;
            }
        }

        return count;
    }


    //returns the frequency of the given element from the given array
    public static int frequencyOfElement(String[] array, String element){
        int count = 0;
        for (String each : array) {
            if(each.equals( element )){
                count++;
            }
        }

        return count;
    }



    // returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {}; //new int[0]

        for (int each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    // returns the unique elements of the array as a new array
    public static double[] uniqueElements (double[] array){
        double[] result = {}; //new int[0]

        for (double each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    // returns the unique elements of the array as a new array
    public static char[] uniqueElements (char[] array){
        char[] result = {}; //new int[0]

        for (char each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }


    // returns the unique elements of the array as a new array
    public static String[] uniqueElements (String[] array){
        String[] result = {}; //new int[0]

        for (String each : array) {

            if( ArraysUtility.frequencyOfElement(array,each) == 1 ){ // if the frequency is one, the element is unique
                result = ArraysUtility.addElement(result, each);
            }

        }

        return result;
    }



    //removes the index from the array, returns new array
    public static int[] removeElement (int[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        int[] result = new int[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static double[] removeElement(double[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        double[] result = new double[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static char[] removeElement(char[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        char[] result = new char[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }


    //removes the index from the array, returns new array
    public static String[] removeElement(String[] array, int index){

        if(index < 0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        String[] result = new String[array.length -1]; //1,2

        int j = 0;
        for (int i= 0; i < array.length; i++) {
            if(i == index){  // if the index of array is matching with the given index
                continue; // skip
            }
            result[j++] = array[i];
        }

        return result;
    }




    // 1. Create a method that can reverse an array
    public static int [] reverse (int [] array){
        int [] reversed = new int [array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reversed [j] = array [i];

        }
        return reversed;
    }

    // 1. Create a method that can reverse an array
    public static double [] reverse (double [] array){
        double [] reversed = new double [array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reversed [j] = array [i];

        }
        return reversed;
    }

    // 1. Create a method that can reverse an array
    public static char [] reverse (char [] array){
        char [] reversed = new char [array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reversed [j] = array [i];

        }
        return reversed;
    }

    // 1. Create a method that can reverse an array
    public static String [] reverse (String [] array){
        String [] reversed = new String [array.length];
        for (int i = array.length - 1, j = 0; i >= 0; i--, j++) {

            reversed [j] = array [i];

        }
        return reversed;
    }


    //replace the elements of the array at given index with the new element
    public static int[] replace(int[] array, int index, int newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static double[] replace(double[] array, int index, double newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static char[] replace(char[] array, int index, char newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    //replace the elements of the array at given index with the new element
    public static String[] replace(String[] array, int index, String newElement){

        if(index <0 || index > array.length-1){
            System.err.println("Invalid Index: "+index);
            System.exit(0);
        }

        array[index] = newElement;
        return array;
    }


    // replaces all the matching old values of the array with the new value
    public static int[] replaceAll(int[] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }

        return array;

    }


    // replaces all the matching old values of the array with the new value
    public static double[] replaceAll(double[] array, double oldValue, double newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }

        return array;

    }


    // replaces all the matching old values of the array with the new value
    public static char[] replaceAll(char[] array, char oldValue, char newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == oldValue) {
                array[i] = newValue;
            }

        }

        return array;

    }


    // replaces all the matching old values of the array with the new value
    public static String[] replaceAll(String[] array, String oldValue, String newValue) {

        for (int i = 0; i < array.length; i++) {

            if (array[i].equals( oldValue) ) {
                array[i] = newValue;
            }

        }

        return array;

    }



    //removes the duplicates from the given array, returns the new array
    public static int[] removeDuplicates(int[] array){

        int[] result = {};//{1,

        for (int each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static double[] removeDuplicates(double[] array){

        double[] result = {};//{1,

        for (double each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }


    //removes the duplicates from the given array, returns the new array
    public static char[] removeDuplicates(char[] array){

        char[] result = {};//{1,

        for (char each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
    }



    //removes the duplicates from the given array, returns the new array
    public static String[] removeDuplicates(String[] array){

        String[] result = {};//{1,

        for (String each : array) {
            if(!ArraysUtility.contains(result, each)){
                result = ArraysUtility.addElement(result, each);
            }
        }

        return result;
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

    // Creat a method swaps the element at index i with the element at index j, and returns the new array
    public static int [] swap (int [] array, int i, int j){

        int temp = array [i];
        array [i] = array [j];
        array [j] = temp;

        return array;
    }
    // Creat a method swaps the element at index i with the element at index j, and returns the new array
    public static char [] swap (char [] array, int i, int j){

        char temp = array [i];
        array [i] = array [j];
        array [j] = temp;

        return array;
    }
    // Creat a method swaps the element at index i with the element at index j, and returns the new array
    public static String [] swap (String [] array, int i, int j){

        String temp = array [i];
        array [i] = array [j];
        array [j] = temp;

        return array;
    }
    // Creat a method swaps the element at index i with the element at index j, and returns the new array
    public static double [] swap (double [] array, int i, int j){

        double temp = array [i];
        array [i] = array [j];
        array [j] = temp;

        return array;
    }

    // converts Array to the ArrayList
    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (int each : array) {
            list.add(each);
        }

        return list;
    }


}
/*
1. 1. Create a method that can reverse an integer array

	2. Create a method that can reverse a double array

	3. Create a method that can reverse a char array

	4. Create a method that can reverse a String array
 */