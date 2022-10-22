package homework;

import java.util.Scanner;

public class homework_16 {
    //Write a code where it meets the below requirements
    //- a couple just got married and goes to city hall to get their last name changed
    //- the officer who works there asks the couple about their first name and last name for each
    //- also asks if they want to use the same last name or keep their original last names
    // ( for the same last name you can use either one of them)
    //- based on the answer print the couples first names and last names

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Groom's name : ");
        String groom=scan.nextLine();
        System.out.println("Groom's Last name : ");
        String groomlastname=scan.nextLine();

        System.out.println("bride's name : ");
        String bride=scan.nextLine();
        System.out.println("bride's last name : ");
        String bridelastname=scan.nextLine();

        System.out.println("Do you want to use same lastname?");
        boolean choice = scan.nextBoolean();

        if (choice){
            System.out.println("groom's full name "+groom + " " + groomlastname);
            System.out.println("bride's full name "+bride+ " "+ groomlastname);
        }else {
            System.out.println("groom's full name "+groom + " " + groomlastname);
            System.out.println("bride's full name "+bride+ " "+ bridelastname);
        }


    }
}
