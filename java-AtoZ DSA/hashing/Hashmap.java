// import java.util.HashMap;

package hashing;

import java.util.*;

class Hashmap {
    public static void main(String[] args) {

        // country(key), population(value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        // Updating
        map.put("China", 180);
        System.out.println(map);

        // Search or LookUp
        if (map.containsKey("China")) {
            System.out.println("Key is present in the map.");
        } else {
            System.out.println("Key is not present in the map.");
        }

        // Get method for getting values
        System.out.println(map.get("India"));
        System.out.println(map.get("Indonesia"));

        // Iteration
        int arr[] = { 13, 28, 38 };

        // 1.
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // 2.
        for(int val : arr){
            System.out.print(val + " ");
        }
        System.out.println();

        // 3.
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        // 4.
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " " + map.get(key));
        }

        // Removing
        map.remove("China");
        System.out.println(map);
    }
}
