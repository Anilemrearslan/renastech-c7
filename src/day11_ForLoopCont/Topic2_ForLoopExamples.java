package day11_ForLoopCont;

import java.util.Scanner;

public class Topic2_ForLoopExamples {

    public static void main(String[] args) {
        // write a code where it counts all the even numbers in between 2 numbers
        //those have been entered by user
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter first number"); // assuming first number is smaller
        int number1=sc.nextInt();
        System.out.println("please enter second number");
        int number2 = sc.nextInt();
        int count=0;
        int cnt=0;
        for (int i = number1; i<=number2; i++){
            if (i%2==0){
                count++;
                System.out.println(i+" is even number");
            }else {
                cnt++;
                System.out.println(i+" is odd number");
            }
        }
        System.out.println("the total count of even numbers between "+number1+" and "+number2+" is "+count);
        System.out.println("the total count of odd numbers between "+number1+" and "+number2+" is "+cnt);









    }
}
