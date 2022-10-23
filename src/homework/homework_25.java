package homework;

import java.util.Scanner;

public class homework_25 {
    //Write a code where the user is asked to enter an integer number
    //- sum of all the odd numbers between 1 to given number (included) but
    // exclude the 9,11,23,35 from the total sum if those numbers happen to be in the range of 1 to the given number.

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        int sumodd=0;
        for (int i = 1; i <=number; i++) {

            if (i==9 || i==11 || i==23 || i==35){
                continue;
            }
            if (i%2!=0){
                sumodd+=i;
                System.out.println("odd numbers: "+i);
            }

        }
        System.out.println("the sum of odd numbers: "+sumodd);

    }
}
