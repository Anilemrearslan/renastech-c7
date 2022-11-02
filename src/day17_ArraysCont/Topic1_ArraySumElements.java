package day17_ArraysCont;

import java.util.Scanner;

public class Topic1_ArraySumElements {

    public static void main(String[] args) {
        // write a code with fallowing requirements
        //user should be asked how many numbers that is going add to array
        //user should be asked for each element for array
        //find the sum of all the elements in array

        Scanner scan =new Scanner(System.in);

        System.out.println("please enter the number of elements would you like to add to Array");
        int size=scan.nextInt();
        double[] numbers =new double[size];

        for (int i = 0; i < size; i++) {// or I could put i < number.length

            System.out.println("please enter the "+(i+1)+". number: ");
            double num = scan.nextDouble();
            numbers[i]=num;
        }

        double sum=0;
        for (int i = 0; i < numbers.length; i++) {

            sum= sum+numbers[i];

        }
        System.out.println("the sum of all numbers in array is: "+sum);










    }//main
}//class
