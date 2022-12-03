package day32_Maps;

import java.util.HashMap;

public class Topic4_Example1 {
    public static void main(String[] args) {
        /*
        Modify and return the given map as follows:
         if the key "a" has a value, set the key "b" to have that value, and set the key "a" to have the value "".
        Basically "b" is a bully, taking the value and replacing it with the empty string.


        mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
        mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
        mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
         */

        HashMap<String, String> MyHashMap = new HashMap<>();
        MyHashMap.put("a", "candy");
        MyHashMap.put("b", "carrot");
        MyHashMap.put("c", "Meh");
        System.out.println(MyHashMap);

//        HashMap<String, String> MyBulliedHashMap = mapBully(MyHashMap);
        System.out.println(mapBully(MyHashMap));
    }

    /// please create a method that takes a hashmap as a parameter.
    /// return type = hashmap
    /// method name = mapBully

    public static HashMap<String , String> mapBully(HashMap<String , String> param1){
//        if the key "a" has a value
        if (param1.containsKey("a")){
//            set the key "b" to have that value, and set the key "a" to have the value ""
            String valueOfA = param1.get("a");
            param1.put("b",valueOfA);
            param1.put("a", "");
        }
        return param1;
    }
}
