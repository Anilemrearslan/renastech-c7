package homework;

import java.util.Scanner;

public class homework_20 {
    //Write a code where user is asked to enter a number.
    //Find the sum of all the even numbers between 0 to that number (included)
    //Find the sum of all the odd numbers between 0 to that number (included)
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int number =scan.nextInt();
        int evensum=0;
        int oddsum=0;

        int i=0;
        while(i<=number){
            if (i%2==0){
                evensum=evensum+i;
                System.out.println("even numbers "+i);
            }else {
                oddsum+=i;
                System.out.println("all odd numbers "+i);
            }
            i++;
        }
        System.out.println("the sum of all even numbers : "+evensum);
        System.out.println("the sum of all odd numbers : "+oddsum);















    }
}
