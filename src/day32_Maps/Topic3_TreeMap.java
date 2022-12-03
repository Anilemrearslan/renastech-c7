package day32_Maps;

import java.util.TreeMap;

public class Topic3_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> ModelYearOfCars = new TreeMap<>();

        ModelYearOfCars.put("Tesla", 2021);
        ModelYearOfCars.put("VolksWagen", 2020);
        ModelYearOfCars.put("Subaru", 2009);

        System.out.println(ModelYearOfCars);

        System.out.println(ModelYearOfCars.keySet());

        System.out.println("********************************");

        for (String myKey: ModelYearOfCars.keySet()) {
            System.out.println("Key = "+myKey);

            //get(key) - Returns the value associated with the specified key
            System.out.println("value= "+ModelYearOfCars.get(myKey));
        }

        System.out.println("********************************");

        System.out.println(ModelYearOfCars.get("BMW"));
        System.out.println(ModelYearOfCars.getOrDefault("BMW", -1));

        ModelYearOfCars.put("Tesla", 2022);
    }
}
