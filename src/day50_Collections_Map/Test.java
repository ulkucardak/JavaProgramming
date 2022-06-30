package day50_Collections_Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"
        ));

        //remove all the names "ahmed"

        Iterator<String> it = names.iterator();

        while(it.hasNext()){
            if(it.next().equalsIgnoreCase("Ahmed")){
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("----------------------------------");

        List<String> names2 = new ArrayList<>();
        names2.addAll(Arrays.asList(
                "Ahmed", "ahmed", "aHmEd", "John", "Ercon", "Daniel", "Mustafa", "Mohammed", "Ahmed", "ahmed", "Yuliia", "Chris"));

        names2.removeIf(p->p.equalsIgnoreCase("Ahmed"));

        System.out.println(names2);

        //remove all the names "ahmed"

        System.out.println("-----------------------------------------");
        List<String> name = new ArrayList<>();
        name.addAll(
                Arrays.asList("Java", "Python", "Cydeo", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam")
        );

        Iterator <String> n = name.iterator();

        while(n.hasNext()){

            String eachName = n.next();
            String reversed = "";

           for(int i =eachName.length()-1; i>=0; i--){
               reversed += eachName.charAt(i);
           }
           if(eachName.equalsIgnoreCase(reversed)){
               n.remove();
           }
        }

        System.out.println(name);

    }
}
