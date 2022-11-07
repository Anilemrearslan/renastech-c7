package homework;

import java.util.Scanner;

public class homework_33 {
    /*
    Write a code where user is asked to enter for 5 employee salaries and store those salaries
Then find the average salary of those 5 employees
     */

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter number of employee");
        int size=scan.nextInt();
        double [] salary = new double[size];

        for (int i = 0; i < salary.length; i++) {
            System.out.println("please enter employee "+(i+1)+". salary");
            double eachsalary=scan.nextDouble();
            salary[i]=eachsalary;
        }

        double sumsalary=0;
        for (int i = 0; i < salary.length ; i++) {
            sumsalary+=salary[i];
        }
        System.out.println("the avarage salary is: "+sumsalary/size);




    }
}
