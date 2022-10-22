package homework;

import java.util.Scanner;

public class homework_19 {
//    Write a code where user is asked to enter a number and check for every number between 0 to that number to
//    see how many numbers between 0 to that number can be divided to 3 and 5 and sum all those numbers, Print the result

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=scan.nextInt();
        int sum=0;
        for (int i = 0; i < number; i++) {
            if (i%3==0 && i%5==0){
                sum+=i;
                System.out.println("numbers that can divided by 3 and 5: "+ i);
            }
        }
        System.out.println("the sum of those nuber that can divided by 3 and 5 : "+ sum);

    }
}
