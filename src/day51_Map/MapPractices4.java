package day51_Map;

import java.util.*;

public class MapPractices4 {
    public static void main(String[] args) {

        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group9 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group24= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};

        Map<Integer, List<String>>groups = new TreeMap<>();
        groups.put(1, Arrays.asList(group1));
        groups.put(2,Arrays.asList(group2));
        groups.put(9,Arrays.asList(group9));
        groups.put(24,Arrays.asList(group24));
        groups.put(5,Arrays.asList(group5));

        System.out.println(groups);
        System.out.println(groups.size());

        for (String eachName : groups.get(9)) {
            System.out.println(eachName);
        }


        System.out.println(groups.get(2).get(1).charAt(0));

        System.out.println("----------------------------------------");

        for (List<String> eachGroup : groups.values()) {

            for (String eachName : eachGroup) {
                System.out.println(eachName);
            }

        }

    }
}
/*
        String[] group1 = {"Duygu","Magda","Farangez","Edison","Kerem","Farangis"};
        String[] group2 = {"Margie","Vesele","Iryn","Nilufar","Aziza","Nurcan","Raika","Igor","Elif","Sana","Azamat"};
        String[] group9 = {"Alex","Ali","Andriy","Cassandra","Sevgul","Olha","Tito","Ozan","Serkan","Furkan","Madina","Muharrem"};
        String[] group24= {"Maria","Kristina","Amin","George","Layan","Amin","Yulia","George","Ayanle","Maxim","Nermin","Doughlas"};
        String[] group5 = {"Nazar","Veronika","Mikael","Layla","Badmaa","Zaeir","Anna","Tamara","Eugene"};
    */