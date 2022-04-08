package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Ulku";
        String lastName =  "Cardak";
        String fullName = firstName +" " + lastName;
        int age = 40;
        String jobTitle = "SDET";
        String companyName = "Apple Inc";
        int salary = 100_000;
        System.out.println("Full name of the person is "+ fullName );
        System.out.println(fullName + " is " + age + " years old.");
        System.out.println(fullName + " is " + jobTitle +" , " + "works at " + companyName+ " " + fullName+ " 's salary is " + "$" +salary );
    }
}
