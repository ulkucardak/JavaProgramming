package day49_Collections;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        String str = "eeeeeaaaabbbbccccdddeeeee";
        String result = "";

        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {

            int count = Collections.frequency(Arrays.asList(str.split("")),each);
            result += each+count;
        }
        System.out.println(result);

        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));
        System.out.println(set);

        List<Integer> list = new ArrayList<>(new HashSet<>(Arrays.asList(1,2,3,4,5,1,2,3,4,5)));

        System.out.println(list);

    }
}
