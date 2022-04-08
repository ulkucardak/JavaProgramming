package day08_LogicalOperatorsAndIfStatements;

public class EligibleToVote {

    public static void main(String[] args) {
        String name = "Ulku";
        int age = 40;
        String citizen = "UK";

        boolean isEligibleToVote = age>= 18 && citizen=="USA";

        if (isEligibleToVote) {

            System.out.println(name + " is eligible to vote");
        }
        if (!isEligibleToVote) {

            System.out.println( name + " is not eligible to vote");
        }

    }
}
