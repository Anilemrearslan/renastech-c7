package homework;

import java.util.Arrays;

import static day22_MethodOverLoadAndWrapperClass.RecapMethodOverLoad.line;

public class homework_38 {
//    Write a method where it takes 2 integer arrays as parameters,
//    and returns to the integer array where it includes 2 highest different values in the first array
//    and 2 lowest different values in the second array.

    public static void main(String[] args) {
        int [] NumberArrayList={56,506,23,42,3,5,6,7,19};
        int[] IntArray= {9,3,4,5,2,10,34};

        System.out.println(Arrays.toString(NumberArrayList));

        ArraysHighNumber(NumberArrayList);

        line();

        System.out.println(Arrays.toString(IntArray));

        ArraysLowNumber(IntArray);

    }


    public static void ArraysHighNumber(int[] nums1){

        // this is for max numbers
        // assume max1 > max2
        int max1=nums1[0];
        int max2=nums1[0];

        for (int i = 0; i < nums1.length; i++) {

                if (max1 < nums1[i]) {
                    max1=nums1[i];
                }
                if (max2 > max1 && max2 < nums1[i]){
                    max2 = nums1[i];
                }

        }
        System.out.println("biggest number in array "+max1);
        System.out.println("Second biggest number in array "+max2);

    }

    public static void ArraysLowNumber(int[] nums2){
        // this is for min numbers
        // assume min1 < min2
//        int min1 = nums2[0];
//        int min2 = nums2[0];
//        for (int i = 0; i < nums2.length; i++) {
//
//            if (min1 > nums2[i]) {
//                min1=nums2[i];
//            }
//            if (min2 < min1 && min2 > nums2[i]){
//                min2 = nums2[i];
//            }
//
//        }
//
//        System.out.println("this is smallest number in array "+min1);
//        System.out.println("this is second smallest number in array "+min2);
//

        int min1;
        int min2;
        Arrays.sort(nums2);
        System.out.println(Arrays.toString(nums2));
        min1 = nums2[0];
        min2 = nums2[1];

        System.out.println("Smallest number in array "+min1);
        System.out.println("Second smallest number in array "+min2);



    }
}
