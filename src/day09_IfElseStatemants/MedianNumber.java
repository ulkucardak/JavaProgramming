package day09_IfElseStatemants;

public class MedianNumber {

    public static void main(String[] args) {

        int n1=10, n2=15, n3=20;

        boolean n1Median = (n1>n2 && n1<n3) || (n1>n3 && n1<n2);
        boolean n2Median = (n2>n1 && n2<n3) || (n2>n3 && n2<n1);
        boolean n3Median = (n3>n1 && n3<n2) || (n3>n2 && n3<n1);
        //boolean n3Median = !n1Median && !n2Median;

        if (n1Median) {
            System.out.println(n1 + " is the median number.");
        }
        if (n2Median){
            System.out.println(n2 + " is the median number.");
        }
        if (n3Median){
            System.out.println(n3 + " is the median number.");
        }

    }
}
/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

			Ex:
				a = 10, b= 15, c = 20;

			Output:
				15 is the median number


			Posibility #1: a could be median number
			Posibility #2: b could be median number
			Posibility #3: c could be median number
 */