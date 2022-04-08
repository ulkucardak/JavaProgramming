package day17_WhileLoop_DoWhile;

public class RemoveDuplicate {
    public static void main(String[] args) {

        String str = "AABBCC";

        String result = ""; //A

        /*for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i); // "A", "A", "B", "B", "C", "C"
            if(result.contains(""+ch)){ // if the result already contains the character
                //  break; // exit
                continue; // skip
            }
            result += ch;
        }

        System.out.println(result);*/
        for (int i = 0; i < str.length(); i++) {
            String ch = "" +str.charAt(i);

            if(result.contains(ch)){
                continue;
            }
            result += ch;
        }
        System.out.println(result);

    }
}
