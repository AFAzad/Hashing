import java.util.*;
// import java.util.HashMap;
// import java.util.Iterator;
public class HashMaps {
    public static void main(String[] args){
        //  Creation; code
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion (.put)
        map.put("Dell", 50);
        map.put("HP", 60);
        map.put("Apple",150);
        map.put("Asus",40);
        map.put("Tosiba", 75);
        System.out.println(map);

        // if key will already exsits it will update or create new map.
        map.put("Asus", 45);
        map.put("Microsoft",100);

        //Searching / Lookup, (.containsKey);
        if(map.containsKey("Apple")){
            System.out.println("Key is present in map");
        }else{
            System.out.println("Map key doesn't found");
        }

        System.out.println(map.get("Asus")); // if key exixts
        System.out.println(map.get("Acer"));   //(null ) key does not exists

        // Iteration 1st on Hash Map;
        // Individual print for key and value
        for(Map.Entry<String,Integer> e : map.entrySet()){
            System.out.println(e.getKey()); // to get key of any map .getKay();
            System.out.println(e.getValue()); // to get value of a map .getValue();
        }

        // Iteration 2nd

        Set<String> keys = map.keySet();
        for(String key: keys){
            System.out.println(key+ " " + map.get(key));
        }
    }
}
