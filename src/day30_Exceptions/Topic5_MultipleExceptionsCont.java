package day30_Exceptions;

import java.util.Scanner;

public class Topic5_MultipleExceptionsCont {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("please enter a number");
            int ValueA= scan.nextInt();

            System.out.println("please enter a number");
            int ValueB= scan.nextInt();

            double ValueC =ValueA/ValueB;
        }catch (ArithmeticException e){
            System.out.println("You can't divide by ZERO!!!");
        }
        int[] MyArray = {1,5,9,6};
        System.out.println("please enter an Index : ");
        int MyIndex = scan.nextInt();

        try {
            System.out.println(MyArray[MyIndex]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("We don't have a value on index : "+MyIndex);
        }

        System.out.println("Rest of the code");

    }
}
