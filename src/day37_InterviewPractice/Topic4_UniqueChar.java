package day37_InterviewPractice;

import java.util.ArrayList;

public class Topic4_UniqueChar {
    public static void main(String[] args) {
        //"abca" = "bc"
        //"hayriaslan" = "hyrisln"
        // Geeksforgeeks  = "for"
        System.out.println(UniqueChars("Geeksforgeeks"));
    }

    public static String UniqueChars(String param1){

        String ReturnValue = "";
        ArrayList<Character>UniqueCharStorage = new ArrayList<>();
        // do something and find unique characters
        char[] MyCharArray = param1.toLowerCase().toCharArray();

        for (int i = 0; i < MyCharArray.length; i++) {
            if (UniqueCharStorage.contains(MyCharArray[i])){

                ReturnValue =ReturnValue.replace(Character.toString(MyCharArray[i]), "");
            }
            else {
                UniqueCharStorage.add(MyCharArray[i]);
                ReturnValue = ReturnValue + MyCharArray[i];
            }
        }

        return ReturnValue;
    }
}
