package day08_LogicalOperatorsAndIfStatements;

public class LogicalOperators {

    public static void main(String[] args) {

        String name =  "Ulku";
        int age = 40;
        String citizen = "UK";

        boolean isEligibleForVote = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote : " + isEligibleForVote);



    }
}
