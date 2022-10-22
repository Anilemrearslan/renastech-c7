package day13_WhileLoop;

import java.util.Scanner;

public class Topic1_WhileLoop {

    public static void main(String[] args) {

        // Write a code where user is being asked to enter 2 numbers and
        // find how many even numbers are in between those 2 numbers

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the first number");
        int num1= scan.nextInt();
        System.out.println("Please enter the second number");
        int num2=scan.nextInt();
        int count=0;
        int sum=0;
        int i= num1;
        while (i<num2){

            if (i%2==0){
                count++;
                sum+=i;
            }
            i++;//if we do not increase the num1 this loop will be infinite
            System.out.println("the num1 value for each iteration: "+ i);
        }
        System.out.println("The count of even numbers between "+num1+" and "+num2+" is " +count);
        System.out.println("sum = " + sum);



    }
}
