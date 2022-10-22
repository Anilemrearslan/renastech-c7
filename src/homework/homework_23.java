package homework;

import java.util.Scanner;

public class homework_23 {
    //Write a program where the user is being asked to enter a String and that
    // will   count   how   many   times   "a" or 'A'   is   found   in that entered String

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String x=scan.nextLine();
        int count=0;

        for (int i=0; i<x.length(); i++){
            if (x.charAt(i)=='a' || x.charAt(i)=='A'){
                count++;
            }
        }
        System.out.println("count of 'A' and 'a' : "+count);




    }
}
