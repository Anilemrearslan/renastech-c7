package homework;

import java.util.Scanner;

public class homework_24 {
    //Write a code where user is being asked to enter a String and that checks if the String is Palindrome
    //PS. A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward,
    // such as madam or racecar. (Java, or Ziya or Cat are not palindrome)
    //(This is a bit hard question, It is an Interview question. Work on it we can solve it later on together)

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter String");
        String word=scan.next();
        String reverse="";

        for (int i=word.length()-1; i>=0; i--){
            reverse=reverse+word.charAt(i);
        }
        System.out.println("reverse = " + reverse);


        if (word.equalsIgnoreCase(reverse)){
            System.out.println("your String is Palindrome");
        }else {
            System.out.println("your String is NOT Palindrome");
        }

    }
}
