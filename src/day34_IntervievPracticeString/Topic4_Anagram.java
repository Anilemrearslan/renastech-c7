package day34_IntervievPracticeString;

import java.util.Arrays;

public class Topic4_Anagram {
    public static void main(String[] args) {
        // Listen - Silent
        // Players - Parsley
        //Triangle - Integral
        // needs - dense
        // meat - team

        // get lowercase of them
        // sort them
        // check them

        System.out.println(UsingArraySort("Listen","Silent"));
    }

    public static Boolean UsingArraySort(String Word1, String Word2){
        Boolean ReturnValue = false;
        // if the length is not equal they are not anagram
        if (Word1.length() != Word2.length()){
            ReturnValue = false;
        }
        else{
            // get lowercase of them
            Word1= Word1.toLowerCase();
            Word2= Word2.toLowerCase();

            // sort them
            char[] word1Array = Word1.toCharArray();
            char[] word2Array = Word2.toCharArray();
            Arrays.sort(word1Array);
            Arrays.sort(word2Array);

            // check them
            ReturnValue = Arrays.equals(word1Array,word2Array);
        }


        return ReturnValue;
    }


    public static Boolean IsAnagramUsingStringMethods(String word1, String word2){
            // Check the length if they are not equal, they are not anagram

        if (word1.length()!=word2.length()){
            return false;
        }
        else{
            // Listen - Silent
            // Players - Parsley
            //Triangle - Integral
            // needs - dense
            // meat - team

            for (int i = 0; i < word1.length(); i++) {
                char MyChar = word1.charAt(i);

                int positionOfMyChar = word2.indexOf(MyChar);

                if (positionOfMyChar == -1){
                    return false;
                }
                else{
                    //dense
                    //nee d s

                    word2 = word2.substring(0,positionOfMyChar)+word2.substring(positionOfMyChar + 1);
                }
            }

        }

        return word2.isEmpty();
    }



}
