package day11_ForLoopCont;

import java.util.Scanner;

public class Topic1_forLoops {

    public static void main(String[] args) {
        /*

        for (int i = Starting; endpoint ; iteration) {
            code block
        }

         */

        // write a code where user enters 2 different numbers
        // and count the numbers that can be divided by 3 that is those are in between those numbers


        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the first integer number: ");
        int num1=sc.nextInt();
        System.out.println("please enter the second integer number:");
        int num2=sc.nextInt();
        int count=0;
        for (int i = num1;   i<=num2;    i++){
            //int count=0; this will set the count to be zero everytime code get executed
            if (i%3==0){
                count++;// count =count+1;
                System.out.println(i+" can be divided by 3");
            }

        }
        System.out.println("The count of all the numbers that can be divided by 3 is: "+count);















    }
}
