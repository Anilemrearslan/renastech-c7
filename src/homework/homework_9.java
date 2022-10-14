package homework;

import java.util.Scanner;

public class homework_9 {
    //    Write a code where User is being asked for the first number,
//    second number and third number.
//    Then Compare those number print the maximum number.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter number");

        int num = scan.nextInt();
        System.out.println("First number is: "+num);

        int num2 = scan.nextInt();
        System.out.println("Second number is: "+ num2);

        int num3= scan.nextInt();
        System.out.println("Third number is: "+num3);

        if (num>num2 && num>num3){
            System.out.println("Biggest number is: "+num);
        }else if (num2>num && num2>num3){
            System.out.println("Biggest number is: "+num2);
        } else if (num3>num && num3>num2) {
            System.out.println("Biggest number is: "+num3);
        }else{
            System.out.println("There is no biggest number");
        }

    }
}
