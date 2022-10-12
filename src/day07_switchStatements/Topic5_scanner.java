package day07_switchStatements;

import java.util.Scanner;

public class Topic5_scanner {

    public static void main(String[] args) {
        //Scanner is a class in Java lab
        //Scanner has multiple methods that can be used
        //In order to have a Scanner you need to create an object from that class
        //In order to use Scanner we need to import the class to our class.

        Scanner scan=new Scanner(System.in);
        System.out.println("Hey user enter a number: ");
        int number=scan.nextInt(); //int number = 12;
        System.out.println("the value of the number is: "+number);

        System.out.println("Hey user enter a double type number: ");
        double dnumber=scan.nextDouble();
        System.out.println("the value of the number is: "+dnumber);


        System.out.println("Hey user enter a byte data type number: ");
        byte bnumber= scan.nextByte();
        System.out.println("the value of the number is: "+bnumber);

        System.out.println("Hey user enter a byte data type number: ");
        float fnumber= scan.nextFloat();
        System.out.println("the value of the number is: "+fnumber);

        System.out.println("Hey user enter a byte data type number: ");
        short snumber= scan.nextShort();
        System.out.println("the value of the number is: "+snumber);

        System.out.println("Hey user enter a byte data type number: ");
        long lnumber= scan.nextLong();
        System.out.println("the value of the number is: "+lnumber);
    }
}
