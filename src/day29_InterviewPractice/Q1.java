package day29_InterviewPractice;

import java.util.Arrays;

public class Q1 {

    //write a method where it takes array of integers and return the sorted version

    // create a method

    // Engine => [4,5,1,7,8,9] => [1,4,5,7,8,9]

    public static void main(String[] args) {

        int [] arr = new int[] {4,5,1,7,8,9};
        System.out.println(Arrays.toString(arr));

        int [] SortedArrayExample = Sort(arr);
        System.out.println(Arrays.toString(SortedArrayExample));
        System.out.println(Arrays.toString(Sort(arr)));


    }


    public static int[] Sort(int [] ArrayNotSorted){

        for (int i =0; i<ArrayNotSorted.length; i++){

            // Inner nested loop pointing 1 index ahead
            for (int j =i+1; j<ArrayNotSorted.length; j++){

                // Checking the elements
                int temp = 0;
                if (ArrayNotSorted[j] < ArrayNotSorted[i]){

                    // Swapping
                    temp = ArrayNotSorted[i];
                    ArrayNotSorted[i]=ArrayNotSorted[j];
                    ArrayNotSorted[j] = temp;

                }
            }
        }


        return ArrayNotSorted;
    }



}
