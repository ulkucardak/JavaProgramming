package day52_Map_FunctionalInterface;

public class Test2 {
    public static void main(String[] args) {

        MySecondFunctionalInterface<String> printEachCharacter = (s) -> {

            for (String eachChar : s.split("")) {
                System.out.println(eachChar);
            }
        };

        printEachCharacter.test("Wooden Spoon");
    }
}
