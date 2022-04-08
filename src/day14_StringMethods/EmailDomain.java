package day14_StringMethods;

public class EmailDomain {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";
        String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        email = email.replace("gmail", "yahoo");

        System.out.println("domain = " + domain);
        System.out.println("email = " + email);

        System.out.println("------------------------------");

        String str = "Java is fun, Java is cool";
        String s = str.substring(str.indexOf("J"), str.indexOf(","));
        System.out.println("s = " + s);
        //String s2 = str.substring(str.indexOf(",")+2);
        //System.out.println("s2 = " + s2);

        int beg = str.lastIndexOf("J");
        String s2 = str.substring(beg);
        System.out.println("s2 = " + s2);
    }
}
/*
1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo
 */