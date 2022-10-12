package day08_Scanners;

import java.util.Scanner;

public class Topic2_NextvsNextLine {

    public static void main(String[] args) {
        // Next() ==> It will read a word from the console. it will stop at space
        // Java Class(just "Java" will scanned)
        //NextLine() ==> it reads the whole line on the console. It wil stop at next line
        // Java Class(whole line "Java Class" will be scanned)

        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter first name and last name ");
        String fullName = sc.nextLine();
        System.out.println("Your full name is "+fullName);

        System.out.println("please enter your phone number ");
        String phone= sc.nextLine();
        System.out.println("your name is "+fullName +"your phone number is "+phone);











    }
}
