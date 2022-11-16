package day24_ArrayList;

import java.util.ArrayList;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class Topic4_RemoveElements {

    public static void main(String[] args) {
        ArrayList<String> RandomWords = new ArrayList<>(4);

        RandomWords.add("mud");
        RandomWords.add("rice");
        RandomWords.add("elastic");
        RandomWords.add("youth");


        /*
        to remove from the element from the ArrayList , we can use remove() method of the ArrayList class
        for example:
         */

        System.out.println(RandomWords);
        RandomWords.remove(RandomWords.indexOf("youth"));
        System.out.println("Modified Arraylist is: "+RandomWords);

        line();

        System.out.println(RandomWords);
        RandomWords.remove("mud");
        System.out.println("Modified Arraylist is: "+RandomWords);

        String ReturnOfRemovedIndex =RandomWords.remove(0);
        System.out.println(ReturnOfRemovedIndex);
        System.out.println("Modified Arraylist is: "+RandomWords);


        System.out.println(RandomWords);
        boolean DidIRemoveTheMud = RandomWords.remove("mud");
        System.out.println(DidIRemoveTheMud);
        System.out.println("Modified Arraylist is: "+RandomWords);

    }
}
