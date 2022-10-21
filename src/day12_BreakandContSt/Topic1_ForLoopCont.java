package day12_BreakandContSt;

import java.util.Scanner;

public class Topic1_ForLoopCont {

    public static void main(String[] args) {

        // write a code where it asks user to enter 2 different numbers
        // and sum all the even numbers in between those 2 numbers

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter first number");
        int num1=scan.nextInt();
        System.out.println("Please enter the second number");
        int num2=scan.nextInt();

        int start;
        int end;
        if (num1>num2){
            start= num2;
            end =num1;
        }else{
            start=num1;
            end = num2;
        }

        int sum=0;
        for (int i=start; i< end; i++){
            if (i%2==0){
                sum+=i;
            }
        }
        System.out.println("The sum of all even numbers in between "+start+" and "+end+" is "+sum);

        System.out.println("Thanks for choosing us :D");












    }
}
