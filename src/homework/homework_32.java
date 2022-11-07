package homework;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class homework_32 {
    
    /*
    //Write   a     program   to   with following requirements
1) user should be prompted about how many numbers is going to be entered 
2) User should be prompted for the values of the numbers
3) Reverse the all the given numbers and print it
     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter a number to choose size of the array");
        int size=scan.nextInt();
        int [] numbers=new int[size];

        for (int i = 0; i < numbers.length; i++) {

            System.out.println("please enter "+(i+1)+"number");
            int num = scan.nextInt();
            numbers[i] = num;
        }

        System.out.println("Numbers array is: "+ Arrays.toString(numbers));

        int [] reversedArray = new int[size];
        int j = 0;
        for (int i = numbers.length-1; i >=0; i--) {
            reversedArray[i]=numbers[j];
            j++;
        }
        System.out.println("reverse array is: "+ Arrays.toString(reversedArray));





        
        
        
    }
    
    
    
    
}
