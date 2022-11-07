package homework;

import java.util.Arrays;
import java.util.Scanner;

public class homework_31 {

//    Write   a   program   that   creates   an   array   of   10   elements   size.
//    Your   program   should   prompt   the   user   to   input   numbers   in   array   and   then   display   the   sum   of   all
//    array   elements. ( we already did this in the class but try to do it again)


    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        int size =scan.nextInt();

        double [] numbers = new double[size];

        double sum=0;

        for (int i = 0; i <numbers.length ; i++) {

            System.out.println("please enter "+(i+1)+"number");

            double num=scan.nextDouble();
            numbers[i]=num;

        }

        for (int i = 0; i < numbers.length; i++) {
            sum =sum+numbers[i];
        }
        System.out.println("array: "+Arrays.toString(numbers));
        System.out.println("sum of all numbers: "+sum);








        }

    }









