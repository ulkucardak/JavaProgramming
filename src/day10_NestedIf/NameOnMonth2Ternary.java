package day10_NestedIf;

public class NameOnMonth2Ternary {
    public static void main(String[] args) {
        int n = 12; // 1-12
        String name;

        name= (n==1)?"January" :(n==2)?"February" :(n==3)?"March" :(n==4)?"April" :(n==5)?"May" :(n==6)?"June"
                : (n==7)?"July" :(n==8)?"Aguost" :(n==9)?"September" :(n==10)?"October" :(n==11)?"November"
                : "December";
        System.out.println(name);



    }
}
