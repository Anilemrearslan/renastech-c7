package day20_Methods;

import java.util.Arrays;

public class Topic3_ForEachLoop {

    public static void main(String[] args) {
        //print each value in the given 2 dimensional array of int:

        int[][] numbers2D={{45653,678,1234,5432,453,12,34},{322,23,45,32,67,89,07,23},{90,231,22,11,145},{12,78,54,32}};

        for(int[] array:numbers2D){

            System.out.println("For the array: "+ Arrays.toString(array));
            System.out.print("the values are: ");
            for (int numbers:array){
                System.out.print(numbers+" ");

            }
            System.out.println(" ");
            System.out.println("***********************");



        }




    }
}
