package day30_Exceptions;

import java.util.Scanner;

public class Topic7_CatchOrder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Please enter a number : ");
            int value = scan.nextInt();

            double MyDouble = 10/value;

            int [] MyArray = {1,2,3,6,5,4};

            System.out.println("please enter an Index : ");
            int AnIndex = scan.nextInt();
            System.out.println(MyArray[AnIndex]);

            String s = null;
            System.out.println(s.length());

        }catch (ArrayIndexOutOfBoundsException MyError){
            System.out.println("we don't have a value in given index");
        }catch (ArithmeticException e){
            System.out.println("You can't divide by ZERO!!!");
        }catch (Exception e){
            System.out.println("something Happened");
            e.printStackTrace();
        }
    }
}
