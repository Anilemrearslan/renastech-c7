package day37_InterviewPractice;

import java.util.Arrays;

public class Topic2_Fibonacci {
    public static void main(String[] args) {
        int Last1 = 0;
        int Last2 = 1;
        System.out.print(Last1+" ");
        System.out.print(Last2+" ");
        int HowMany = 10;

        for (int i = 2; i < HowMany*2; i++) {
            int nextOne = Last1+Last2;
            System.out.print(nextOne+" ");
            Last1 = Last2;
            Last2 = nextOne;
        }

    }
}
