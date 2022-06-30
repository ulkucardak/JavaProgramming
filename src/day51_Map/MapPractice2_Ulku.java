package day51_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice2_Ulku {
    public static void main(String[] args) {

        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);
        map.put("Ulku",135000);

       // 1.1 who has the maximum salary?

        // int maxSalary = Collections.max(map.values());

        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        for (Integer eachSalary : map.values()) {
            if(eachSalary>maxSalary){
                maxSalary = eachSalary;
            }
            if(eachSalary<minSalary){
                minSalary=eachSalary;
            }
        }
        System.out.println("minSalary = " + minSalary);
        System.out.println("maxSalary = " + maxSalary);

        //1.3 how many employees has the salary between 120k ~ 150K?
        int countSalary = 0;
        for (Integer eachSalary : map.values()) {

            if(eachSalary>120000 && eachSalary<150000){
                countSalary++;
            }
        }
        System.out.println("countSalaryBetween120_150 = " + countSalary);


        //1.2 who has the minimum salary?

        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {

            if(eachPair.getValue()==maxSalary){
                System.out.println(eachPair.getKey()+ " has max salary");
            }
            if(eachPair.getValue()==minSalary){
                System.out.println(eachPair.getKey()+ " has min salary");
            }
        }

        //1.4 display the names of the employees who are making less than 118k?

        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {
            if(eachPair.getValue()<118000){
                System.out.println(eachPair.getKey()+ " has less than $118000");
            }
        }

        //1.5 increase the salary of each employee by 10K if the current salary of employee is less than 120K
        for (Map.Entry<String, Integer> eachPair : map.entrySet()) {
            if(eachPair.getValue()<120000){
                //map.replace(eachPair.getKey(),(eachPair.getValue()+10000)); // or
                eachPair.setValue(eachPair.getValue()+10000);
            }



        }
        System.out.println(map);

    }
}
/*
1. Given the following map that contains the employee name and thier salary:
     Map<String, Integer> map = new LinkedHashMap<>();
        map.put("John", 123000);
        map.put("Antony", 100000);
        map.put("Jimmy", 115000);
        map.put("James", 110000);
        map.put("Conor", 85000);
        map.put("Josh", 117000);
        map.put("Cory", 118000);
        map.put("Anderson",125000);
        map.put("Steven", 135000);

 */