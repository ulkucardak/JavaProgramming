package day10_NestedIf;

public class GradeReport2Ternary {
    public static void main(String[] args) {
        
         /*
        90 ~ 100: Excellent
        80 ~ 89: Great
        70 ~ 79: Good
        60 ~ 69: Passed
        0 ~ 59: failed
         */

        int s = 90;

        if(s >= 0 && s <= 100){ // if the s is valid (0 ~ 100 )
            // 5 possibilities: A, B, C, D, F
            if(s>= 90 ){ //false:  s < 90
                System.out.println("Excellent");
            }else if(s >= 80 ){ // false: s < 80
                System.out.println("Great");
            }else if(s >= 70){ // false: s < 70
                System.out.println("Good");
            }else if(s >= 60){// false: s < 60
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }

        }else{ // if the s is NOT valid
            System.out.println("Invalid s");
        }

        System.out.println("----------------------------");

       String result = (s>=0 && s<=100)? (s>=90)?"Exellent" :(s>=80)?"Great" :(s>=70)?"Good" :(s>=60)?"Passed" :"Failed"
                : "Invalid Score";
        System.out.println(result);


    }
}
