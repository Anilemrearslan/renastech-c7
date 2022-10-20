package day11_ForLoopCont;

import java.util.Scanner;

public class Topic4_ReverseString {

    public static void main(String[] args) {
        //write a code where user is being asked to enter a String , Reverse the String and print it
        //Ex: Ugur ==> rugU //Sena ==> aneS

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter something on the console that you want to reverse");
        String input = scan.nextLine();
        // ziya ==> ayiz
        //String name = "ziya";
        char ch= input.charAt(0);
        System.out.println("the first character: "+ch);
        char ch1= input.charAt(1);
        System.out.println("the second character: "+ch1);

        System.out.println("the length of String is: "+input.length());
        System.out.println("the last character: "+ input.charAt(input.length()-1));

        String Reverse ="";

        for (int i = input.length()-1 ; i >=0 ; i--) {
            Reverse = Reverse+input.charAt(i); // revers = ""+l== l
                                                //revere = l+e == le
        }
        System.out.println("the reverse of the input is "+Reverse);








    }
}
