package day37_InterviewPractice;

import java.util.Scanner;

public class Topic3_Digits {
    public static void main(String[] args) {
//         15934 = 5 Digits
//         154   = 3 Digits
//         0154  = 3 Digits <- converting int to String and get length will not work

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int AValue = scan.nextInt();
        System.out.println(Digits(AValue));


    }

    public static int Digits(int param1){
        int HowManyDigit = 0;

        // Do something to calculate how many digits we have
//        154 = 4 + 5*10 + 1*100
//        154/10 = 15
//        15/10 = 1
//        1/10 = 0

        while(param1 > 0){
            param1=param1/10;
            HowManyDigit++;
        }

        return HowManyDigit;
    }
}
