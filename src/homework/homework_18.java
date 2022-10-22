package homework;

import java.util.Scanner;

public class homework_18 {
    //Write a code where user is asked to enter an integer number:
    //Using the given number find the factorial of that number and Print the result.
    //example: 5 ==> 5! = 5*4*3*2*1 = 120

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a first number ");
        int num1=scan.nextInt();
        int result=1;
//        int i= num1;
//        while(i>0){
//
//            result=result*i;
//            System.out.println(i);
//            i--;
//
//        }
//        System.out.println(result);

        for (int i = num1; i > 0; i--) {
            result=result*i;
        }
        System.out.println(result);




    }
}
