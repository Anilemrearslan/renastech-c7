package homework;

import java.util.Scanner;

public class homework_10 {
//    Write a code where user is being asked to enter a number and based on
//    the entered number print the number is positive,
//    negative or zero
public static void main(String[] args) {


    Scanner scan = new Scanner(System.in);

    System.out.println("Please enter number");

    double number = scan.nextDouble();

    if (number > 0){
        System.out.println("Your number is positive");
    }else if (number<0){
        System.out.println("Your number is negative ");
    }else {
        System.out.println("Your number is zero");
    }



}
}
