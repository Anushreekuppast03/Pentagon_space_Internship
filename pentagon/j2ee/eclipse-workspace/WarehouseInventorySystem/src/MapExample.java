import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        // Create a HashMap
        Map<Integer, String> map = new HashMap<>();

        // put() - Add key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // get() - Get value by key
        System.out.println("Value at key 2: " + map.get(2));

        // containsKey() and containsValue()
        System.out.println("Map contains key 3: " + map.containsKey(3));
        System.out.println("Map contains value 'Banana': " + map.containsValue("Banana"));

        // remove() - Remove by key
        map.remove(1);
        System.out.println("Map after removing key 1: " + map);

        // isEmpty() - Check if map is empty
        System.out.println("Is map empty? " + map.isEmpty());

        // size() - Number of entries in map
        System.out.println("Map size: " + map.size());

        // keySet() - Get all keys
        System.out.println("Keys: " + map.keySet());

        // values() - Get all values
        System.out.println("Values: " + map.values());

        // entrySet() - Get key-value pairs
        System.out.println("Entries:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
