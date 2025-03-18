package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");
        map.put(null, "Grapes"); // Allows one null key
        map.put(4, null);        // Allows multiple null values

        // Retrieving values
        System.out.println("Value for key 2: " + map.get(2));

        // Checking if a key exists
        System.out.println("Contains key 3? " + map.containsKey(3));

        // Checking if a value exists
        System.out.println("Contains value 'Apple'? " + map.containsValue("Apple"));

        // Iterating through HashMap
        System.out.println("HashMap contents:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

