package homework;

import java.util.Arrays;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class homework_36 {
//    Write a method where it takes array of integers and returns the sorted version of that array

    public static void main(String[] args) {

        //this one with sort method
        int [] NumberArrayList={56,506,23,42,3,5,6,7,19};

        System.out.println(Arrays.toString(NumberArrayList));

        Arrays.sort(NumberArrayList);

        System.out.println(Arrays.toString(NumberArrayList));

        line();


        //this is without using sort() method
        //instead of sort() method I created another method and used for loop in there

        System.out.println(Arrays.toString(sortedArray(NumberArrayList)));

    }

    public static int[] sortedArray(int[] Arr){

        for (int i = 0; i < Arr.length; i++) {

            for (int j = 0; j < Arr.length; j++) {
                int temp=0;
                if (Arr[i] < Arr[j]){
                    temp=Arr[i];
                    Arr[i]=Arr[j];
                    Arr[j]=temp;
                }
            }

        }

        return Arr;
    }


}
