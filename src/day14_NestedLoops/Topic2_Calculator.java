package day14_NestedLoops;

import java.util.Scanner;

public class Topic2_Calculator {

    public static void main(String[] args) {
        /*
        write a calculator program where it will do fallowing:
        1) User will be asked to make the decision 1 for sum, 2 for sub,3 for div, 4 for multi,
        any other number to exit
        2) When user make the selection use should be asked to enter the first number
        3)after that user should be asked to enter second number
        4) perform calculation and print the result
        5)Perform the calculation for different entries unless user select exit
         */

        System.out.println("****** Welcome the calculator ********");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please make the selection: 1 for sum, 2 for sub,3 for div, 4 for multi,any other number to exit ");
        int selection=scan.nextInt();
        while(selection==1||selection==2||selection==3||selection==4){

            System.out.println("please enter the first number: ");
            double num1=scan.nextDouble();
            System.out.println("Please enter the second number: ");
            double num2=scan.nextDouble();
            double result = 0;
            if(selection==1){
                result=num1+num2;
            }else if (selection==2){
                result=num1-num2;
            }else if (selection==3){
                result=num1/num2;
            }else {
                result=num1*num2;
            }

            System.out.println("The result of the operation is: "+result);
            System.out.println("Please make the selection: 1 for sum, 2 for sub,3 for div, 4 for multi,any other number to exit ");
            selection=scan.nextInt();

        }
        System.out.println("Thank you for using calculator you are exiting now");



    }
}
