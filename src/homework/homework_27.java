package homework;

import java.util.Scanner;

public class homework_27 {
//    Write a code which asks user to enter a String and removes all the duplicate characters from the String and prints the result
//    ex. "AAAAAVVVCCDDAA" ==> "AVCD"

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String input = scan.nextLine();
        String output="";

        for (int i = 0; i < input.length(); i++) {
            if(!output.contains(String.valueOf(input.charAt(i)))) {
                output += String.valueOf(input.charAt(i));
            }
                }
        System.out.println(output);




            }
        }







