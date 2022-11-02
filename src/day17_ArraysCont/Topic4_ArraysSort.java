package day17_ArraysCont;

import java.util.Arrays;

public class Topic4_ArraysSort {

    public static void main(String[] args) {

        int [] nums={56,32,34,90,-345,-12,-34};

        System.out.println("the nums array is: "+Arrays.toString(nums));
        System.out.println("the first element in nums: "+nums[0]);

        Arrays.sort(nums);

        System.out.println("the nums Array now is: "+Arrays.toString(nums));
        System.out.println("the first element in nums: "+nums[0]);

        String [] names ={"Zeliha","Eloise","Hrakar","Amer"};
        System.out.println("the array of names is: "+Arrays.toString(names));

        Arrays.sort(names,0,3);
        System.out.println("the array of names is: "+Arrays.toString(names));

        System.out.println("***********************************************************");

        //how to do decreasing order
        int [] nums3 ={90,34,-123,-456,23,1234,5673};
        int [] reverse = new int[nums3.length];
        Arrays.sort(nums3);

        int j=0;
        for (int i = nums3.length-1; i >= 0 ; i--) {
            reverse[j]=nums3[i];
            j++;
        }

        System.out.println("the reverse is: "+Arrays.toString(reverse));
        
        
        
    }
}
