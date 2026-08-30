// import java.util.HashMap;
// import java.util.Map;
// import java.util.Set;
import java.util.*;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("china",120);
        map.put("India",180);
        map.put("Newyork",40);
        map.put("china",150); //this will update the value of china from 120 tp 150 
        // System.out.println(map.containsKey("netharlannd"));
        System.out.println(map.get("netherlands"));
  
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
  Set<String> keys=map.keySet();
  for(String key: keys){
    System.out.println(key+ "" + map.get(key));
  }
  map.remove("India");
  System.out.println(map);
    }
}
