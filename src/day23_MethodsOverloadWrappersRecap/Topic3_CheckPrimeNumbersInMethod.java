package day23_MethodsOverloadWrappersRecap;

import java.util.Scanner;

public class Topic3_CheckPrimeNumbersInMethod {

    public static void main(String[] args) {
        /*
        check prime numbers between given 2 value
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the lowest number");
        int low = scan.nextInt();

        System.out.println("Please enter the highest number ");
        int high = scan.nextInt();

        for (int i = low; i <=high; i++) {
            if (CheckPrimeNumber(i)== true){
                System.out.print(i + " ");
            }
        }

    }

    public static boolean CheckPrimeNumber(int param1){
        boolean IsItPrimeNumber = true;
        for (int i = 2; i < param1 ; i++) {
            if ( (param1 % i==0) ){
                IsItPrimeNumber= false;
            }
        }
        return IsItPrimeNumber;
    }
}
