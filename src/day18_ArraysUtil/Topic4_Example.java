package day18_ArraysUtil;

import java.util.Arrays;
import java.util.Scanner;

public class Topic4_Example {

    public static void main(String[] args) {
        //write a code with fallowing instructions
        /*
        1) ask user to enter a sentence
        2)CHECK each word in the sentence to see how many 'l','a' and 'b' characters in each word
         */


        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a sentence");
        String sentence=scan.nextLine();
        String [] words =sentence.split(" ");
        System.out.println("all the words in the Sentence: "+Arrays.toString(words));


        for (int i = 0; i < words.length; i++) {

            String word =words[i];
            int counta=0;
            int countl=0;
            int countb=0;
            char [] chars=word.toCharArray();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j]=='a' || chars[j]=='A'){
                    counta++;
                }else if (chars[j]=='l' || chars[j]=='L'){
                    countl++;
                }else if(chars[j]=='b' || chars[j]=='B'){
                    countb++;
                }
            }

            System.out.println("the word : "+words[i]+" has "+counta+" A in it");
            System.out.println("the word : "+words[i]+" has "+countb+" B in it");
            System.out.println("the word : "+words[i]+" has "+countl+" L in it");
        }













    }
}
