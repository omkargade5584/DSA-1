package Hashing;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<Integer, String> table = new Hashtable<>();

        // Adding key-value pairs
        table.put(1, "Apple");
        table.put(2, "Banana");
        table.put(3, "Cherry");

        // Retrieving values
        System.out.println("Value for key 2: " + table.get(2));

        // Checking if a key exists
        System.out.println("Contains key 3? " + table.containsKey(3));

        // Checking if a value exists
        System.out.println("Contains value 'Apple'? " + table.containsValue("Apple"));

        // Iterating through Hashtable
        System.out.println("Hashtable contents:");
        for (Integer key : table.keySet()) {
            System.out.println("Key: " + key + ", Value: " + table.get(key));
        }
    }
}
