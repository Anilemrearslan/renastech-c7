package day30_Exceptions;

import java.util.Scanner;

public class Topic2_ExceptionsCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("please enter a number ");
        int ValueA = scan.nextInt();

        System.out.println("please enter a number ");
        int ValueB = scan.nextInt();

        try {
            double ValueC = ValueA/ValueB;
            System.out.println("The result = "+ValueC);
        }catch (Exception e){
            System.out.println("Can't divide by Zero!");
        }



        System.out.println("rest of the code");

    }
}
