package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {
        int number = 13;
        String result = " ";
        int year = 2000;

        if(number>=1 && number<=12){

            switch (number){
                case 2:
                result= (year%4==0)?"29 Days" : "28 Days";
                break;
                case 4: case 6: case 9: case 11:
                result= "30 Days";
                break;
                //case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                default:
                result= "31 Days";
            }


            } else{
                result= "Invalid Number";

        }
                System.out.println(result);

    }
}
/*
4. NumberOfDays
			28 Days: 2
			30 days: 4, 6, 9, 11
			31 days: 1, 3, 5, 7, 8, 10, 12

			If(1~12){


			}else{
				Invalid
			}
 */