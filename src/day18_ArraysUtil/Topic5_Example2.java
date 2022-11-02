package day18_ArraysUtil;

import java.util.Scanner;

public class Topic5_Example2 {

    public static void main(String[] args) {

        //write a code where user is being asked to enter a sentence
        //check for each word to see how many 4 char substring in the word palindrome

        // "this Afternoon I found RRRRTESTdaad something that had DIID on it."


        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a sentence ");
        String sentence= scan.nextLine();

        String [] words= sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word=words[i];
            int count=0;
            if (word.length()<4){
                continue;
            }
            for (int j = 0; j < word.length()-3; j++) {

                String sub = word.substring(j,j+4);
                String reverse="";
                for (int k = sub.length()-1; k >=0; k--) {
                    char c= sub.charAt(k);
                    reverse+=c;

                }

                if (sub.equals(reverse)){
                    count++;
                }

            }

            System.out.println("the word: "+word+" has "+count+" polindrome 4 char substring");
        }









    }
}
