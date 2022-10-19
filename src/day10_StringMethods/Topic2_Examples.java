package day10_StringMethods;

import java.util.Scanner;

public class Topic2_Examples {
    public static void main(String[] args) {
        String name= "Baran Cevrim";//BarCev
        String newName= name.substring(0,3)+name.substring(6,9);
        System.out.println("The value of newName is: "+newName);

        System.out.println("********************");

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first name");
        String FirstName= scan.nextLine();
        System.out.println("Please enter last name");
        String LastName= scan.next();
        String changed = (FirstName.replace('a','b')
                +LastName.replace('a','c')).toUpperCase();
        System.out.println("the value of Changed now is: "+changed);



    }
}
