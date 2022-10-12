package day08_Scanners;

import java.util.Scanner;

public class Topic3_ScannerExample {

    public static void main(String[] args) {
        //write a code where it asks user to enter 3 different name (first name and last name)
        //and the age print the person's name and age who is the oldest.
        Scanner scan=new Scanner(System.in);

        //first person
        System.out.println("please enter first person name ");
        String name1= scan.nextLine();
        System.out.println("please enter first person's age");
        int age1 = scan.nextInt();scan.nextLine();

        //second person
        System.out.println("please enter second person name ");
        String name2= scan.nextLine();
        System.out.println("please enter second person's age");
        int age2 = scan.nextInt();scan.nextLine();

        //third person
        System.out.println("please enter third person name ");
        String name3= scan.nextLine();
        System.out.println("please enter third person's age");
        int age3 = scan.nextInt();

        if (age1>age2 && age1>age3){
            System.out.println("the oldest person's name and age is "+name1+age1);
        }else if (age2>age1 && age2>age3){
            System.out.println("the oldest person's name and age is "+name2+age2);
        }else if (age3>age1 && age3>age2){
            System.out.println("the oldest person's name and age is "+name3+age3);
        }else {
            System.out.println("there is no oldest one person in group");
        }


    }
}
