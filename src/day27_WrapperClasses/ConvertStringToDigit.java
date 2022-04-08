package day27_WrapperClasses;

public class ConvertStringToDigit {
    public static void main(String[] args) {

        String s = "ab1cde2efg3hi4";
        int sum = 0;
        for (char each : s.toCharArray()) {
            if(Character.isDigit(each)){
                sum += Integer.parseInt("" +each);
                
            }
        }
        System.out.println("sum = " + sum);
        

        
        
    }
}
