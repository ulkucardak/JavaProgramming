package day48_Collections;

import day31_Constructors.scrumTask.Tester;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestForPolymorphism {
    public static void main(String[] args) {

        Tester tester1 = new Tester("Ahmet",12,"QA",50000);

        Collection values = new ArrayList<>();

        values.add(5);
        values.add("ulku");
        values.add(tester1);

        System.out.println(values);
    }

}
