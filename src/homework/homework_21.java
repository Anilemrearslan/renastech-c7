package homework;

import java.util.Scanner;

public class homework_21 {
    //Write a code where user is asked to enter a number:
    //Calculate the square of all the numbers from 0 to given number and
    // print the result for each number, (square of a number is number*number == > 5*5 = 25 or 6*6 = 36)
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    int square=0;
    int i=0;
    while(i <= number){
        System.out.println("Square of a number is: "+i+"*"+i+" = "+i*i);
        i++;
    }










  }
}
