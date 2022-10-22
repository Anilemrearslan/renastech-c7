package day13_WhileLoop;

import java.util.Scanner;

public class Topic2_WhileCont {

    public static void main(String[] args) {
        // Write a code where user is being asked to enter v2 number and sum all the numbers
        //in between those numbers can be divided by 5
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1= scan.nextInt();
        System.out.println("Please enter the second number");
        int num2=scan.nextInt();
        int sum=0;
        int i;
        int j;
        if (num1>num2){
            i=num2;
            j=num1;
        }else {
            i=num1;
            j=num2;
        }

        while(i<j){

            if (i%5==0){

                sum+=i;

            }
            System.out.println("The i value is "+i);
                i++;

        }
        System.out.println("sum of those numbers "+sum);












    }
}
