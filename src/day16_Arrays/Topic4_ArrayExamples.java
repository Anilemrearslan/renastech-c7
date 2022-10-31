package day16_Arrays;

import java.util.Arrays;

public class Topic4_ArrayExamples {

    public static void main(String[] args) {

        int[] arr= {9,3,4,5,2,10,34};

        System.out.println("arr.length = " + arr.length);
        int leng = arr.length;// length method returns to an intager value which the size or the length of an array
        System.out.println("the variable leng is the length of array = " + leng);

        //System.out.println("All the values in array: "+ Arrays.toString(arr));

        System.out.println("the value in index 0: "+arr[0]);
        System.out.println("the value in index 0: "+arr[1]);
        System.out.println("the value in index 0: "+arr[2]);
        System.out.println("the value in index 0: "+arr[3]);
        System.out.println("the value in index 0: "+arr[4]);
        System.out.println("the value in index 0: "+arr[5]);
        System.out.println("the value in index 0: "+arr[6]);

        System.out.println("************************************************************************");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("the value in index "+i+" : "+arr[i]);
        }


    }
}
