package day51_Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 95);
        students.put("Maria", 90);
        students.put("Ali",85);
        students.put("Alex",80);
        students.put("Ozan",99);
        students.put("Serkan",70);
        students.put("Andriy",98);

        Collection<Integer> values = students.values();
        
        int frequencyOfOver95 = 0;

        for (Integer score : values) {
            if(score>95){
                frequencyOfOver95 ++;
            }
        }

        System.out.println("frequencyOfOver95 = " + frequencyOfOver95);

        Set<Map.Entry<String, Integer>> entries = students.entrySet();

        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+ " : "+ entry.getValue());


        }

        students.clear();
        System.out.println( students);

        Map<String, String> employeeMap = new HashMap<>();
        employeeMap.put("Ddene", "F");
        employeeMap.put("Winfred", "M");
        employeeMap.put("Jereme", "M");
        employeeMap.put("Glad", "F");
        employeeMap.put("Desirae", "F");
        employeeMap.put("Kakalina", "F");
        employeeMap.put("Bertrando", "M");
        employeeMap.put("Ajay", "F");
        employeeMap.put("Brigitte", "F");
        employeeMap.put("Derk", "M");
        employeeMap.put("Orlando", "M");
        employeeMap.put("Selle", "F");
        employeeMap.put("Marika", "F");

        for (String eachKey : employeeMap.keySet()) {
            if(employeeMap.get(eachKey).equalsIgnoreCase("m")){
                employeeMap.replace(eachKey,"Male");
            }
            if(employeeMap.get(eachKey).equalsIgnoreCase("f")){
                employeeMap.replace(eachKey,"Female");
            }
        }
        System.out.println(employeeMap);

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {
            if(entry.getValue().equalsIgnoreCase("male")){
                //entry.setValue("M");
                employeeMap.replace(entry.getKey(),"M");
            }

        }

        for (Map.Entry<String, String> entry : employeeMap.entrySet()) {

            if(entry.getValue().equalsIgnoreCase("Female")){
                System.out.println(entry.getKey());
            }

        }

    }
}
