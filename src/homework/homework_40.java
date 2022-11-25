package homework;

import java.util.Scanner;

public class homework_40 {
//    Write a method that takes the day as an integer such as (1 for Monday, 2 for Tuesday, and so on)
//    and it returns a String value indicating "Go To Work" for weekdays and "Go Back to Sleep" weekends.
//
//    Please create a method that takes one integer parameter and returning a String.
//    Name your Method as (GotoSleeporWork)
//    Based on your parameter, if you are in weekdays, return "Go To Work" otherwise return "Go Back to Sleep".


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number for a day of week");
        int Day = scan.nextInt();

        String WhatShouldIDo=GotoSleepOrWork(Day);
        System.out.println(WhatShouldIDo);

    }

    public static String GotoSleepOrWork(int param1){

        String work="go to work";
        String sleep = "Go Back to Sleep";
        if (param1==1 || param1==2 || param1==3 || param1==4 || param1==5 ){
            return work;
        } else if (param1==6 || param1==7 ) {
            return sleep;
        }

        return null;
    }

}
