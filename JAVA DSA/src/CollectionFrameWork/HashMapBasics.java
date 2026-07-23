package CollectionFrameWork;

import java.util.*;


public class HashMapBasics {

    static void main(String[] args) {
        java.util.Map<String, String> mapping = new HashMap<>();

        //insertion
        mapping.put("in", "India");
        mapping.put("en", "England");
        mapping.put("us", "United States");

        System.out.println(mapping);

        java.util.Map<String, String> table = new HashMap<>();
        table.put("br", "brazil");

        System.out.println("Before: " + table);
        table.putAll(mapping);
        System.out.println("After: " + table);


        //deletion
        table.remove("en");
        System.out.println(table);

        System.out.println("br");

        System.out.println(table.getOrDefault("us", "NONE"));

        System.out.println(table.containsKey("in"));

        System.out.println(table.containsValue("United States of AMerica"));

        System.out.println(table);

        table.replace("in", "indonesia");
        System.out.println(table);

        Set<String> keyset = table.keySet();
        System.out.println(keyset);

        Collection<String> valueSet = table.values();
        System.out.println(valueSet);

        //get all the entries form map
        Set<java.util.Map.Entry<String, String>> entryset = table.entrySet();
        System.out.println(entryset);









//        table.putIfAbsent("in", "India3");
//        System.out.println(table.size());
//        table.clear();
//        System.out.println(table.size());


    }
}
