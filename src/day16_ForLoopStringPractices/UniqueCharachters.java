package day16_ForLoopStringPractices;

public class UniqueCharachters {

    public static void main(String[] args) {

        String str = "aaabccc";
        String result = "";

        for(int i=0; i<=str.length()-1; i++){
            String ch =""+ str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){
                result += ch;
            }
        }
        System.out.println(result);

    }
}
/*

 */