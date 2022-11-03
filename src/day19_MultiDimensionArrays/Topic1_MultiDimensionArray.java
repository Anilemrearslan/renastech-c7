package day19_MultiDimensionArrays;

import java.util.Arrays;

public class Topic1_MultiDimensionArray {

    public static void main(String[] args) {
        // multiDimension arrays are basically array inside of array

        //names = {  {"Ziya","John","Eloise"},{"Anil","Rami"}  }

        int[][] numbers={   {3,4,5,6,7,8} ,   {8,7,3,4,1,0,-123} ,     {90,23,145,109,107}    };
              ////             index0              index1                 index2
        int a = numbers[0][1];

        System.out.println("a = " + a);

        System.out.println("the number is: "+numbers[1][6]);

        System.out.println("the number 2 is: "+numbers[2][3]);

        int len = numbers.length;
        System.out.println(len);

        System.out.println("the numbers array is: "+numbers[0]);
        System.out.println("the numbers array is: "+ Arrays.toString(numbers[0]));

    }
}
