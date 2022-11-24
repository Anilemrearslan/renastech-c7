package day29_InterviewPractice;

import java.util.Arrays;

public class Q3 {
    //Two Numbers Sum Problem Statement
    //Given an array of integers, return the indicates of the two whose sum is equal to given target

    //[12,17,21,25] , 29
    //[0,1]

    public static void main(String[] args) {

        int[] newArray = new int[] {12,17,21,25};
        int target = 29;

        System.out.println(Arrays.toString(twoSum(newArray,target)));
    }

    public static int[] twoSum(int[] input, int target){

        for (int i = 0; i < input.length; i++) {// [12,17,21,25]

            int first = input[i];//12

            for (int j = i+1; j < input.length; j++) { //[17,21,25]

                int second = input[j];// 17

                if ((first+second) == target){
                    return new int[]{i,j};
                }

            }

        }

        return null;
    }


}
