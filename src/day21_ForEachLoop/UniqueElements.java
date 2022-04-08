package day21_ForEachLoop;

public class UniqueElements {
    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};


        for (String each : words) {
            int frequency = 0;

            for (String element : words) {
                if(each.equals(element)){
                    frequency += 1;
                }
            }
            if(frequency==1){
                System.out.println("Unique element is "+ each);
            }
        }

    }
}
