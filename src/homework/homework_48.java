package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class homework_48 {
    /*
    Write a method where it takes ArrayList of String and the index, returns the element of that index in the ArrayList

Please create a method that takes 2 parameters. An ArrayList of String and an Integer.
Return type String.
Please return the string at the given index.
     */
    public static void main(String[] args) {

        ArrayList<String> List = new ArrayList<>(Arrays.asList("d","a","g","f","w"));
        System.out.println(List);
        System.out.println("The element in the given index : "+ReturnStringInGivenIndex(List, 1));
    }

    public static String ReturnStringInGivenIndex(ArrayList<String>param1, int param2){
        return param1.get(param2);
    }
}
