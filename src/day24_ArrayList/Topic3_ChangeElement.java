package day24_ArrayList;

import java.util.ArrayList;

public class Topic3_ChangeElement {
    public static void main(String[] args) {
        ArrayList<String> RandomWords = new ArrayList<>(4);

        RandomWords.add("mud");
        RandomWords.add("rice");
        RandomWords.add("elastic");
        RandomWords.add("youth");

        System.out.println(RandomWords);

        /*
        to chance elements of the ArrayList we use set() method of the Arraylist class. for exaple:
         */

        RandomWords.set(1,"noddle");
        System.out.println(RandomWords);

        /*
        Here, the set() metho changes the element at index 1 to noddle ("rice" => "noddle")
         */

        /*

         */

        int indexOfElastic = RandomWords.indexOf("elastic");


        // -1 0 1 2 3 4 ..........
        int indexOfHayri = RandomWords.indexOf("Hayri");

        System.out.println(indexOfHayri);

        if (indexOfHayri > -1){
            System.out.println("we have Hayri in the ArrayList");
        }else {
            System.out.println("we don't Have hayri in the ArrayList");
        }


        boolean DoWeHaveBulgurInArrayList = RandomWords.contains("bulgur");
        System.out.println(DoWeHaveBulgurInArrayList);



    }
}
