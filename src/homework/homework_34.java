package homework;

import java.lang.reflect.Array;
import java.util.Arrays;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class homework_34 {

//    Write code where it shifts all the elements in array by one index and
//    put the the first index at the end of the array
//    example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}

    public static void main(String[] args) {

        int arr[] = {2,3,4,5,6,7,8,9};

        int dummy =arr[0];

        for (int i = 0; i < arr.length-1; i++) {

            arr[i]=arr[i+1];
            System.out.println(Arrays.toString(arr));
        }
        arr[arr.length-1]=dummy;

        line();
        System.out.println(Arrays.toString(arr));
        line();

    }



}
