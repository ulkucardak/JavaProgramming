package day12_ScannerSwitch;

public class GradeLevel {
    public static void main(String[] args) {

        byte number = 15;
        String schoolType= " ";

        if(number>=1 && number<=18){
            switch(number){
                case 6: case 7: case 8:
                    schoolType="Middle School";
                    break;
                case 9: case 10: case 11: case 12:
                    schoolType="High school";
                    break;
                case 13: case 14: case 15: case 16:
                    schoolType="Collage";
                    break;
                case 17: case 18:
                    schoolType="Grad School";
                    break;
                default:
                    schoolType="Elementary School";

            }


        }else {
            System.out.println("Invalid Grade");
        }
        System.out.println(schoolType);

    }
}
/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
                grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School

                        For Any Other grade: Invalid grade level given

                Note:
                    Solution 1: Use switch statement
                    Solution 2: use if & switch both
 */