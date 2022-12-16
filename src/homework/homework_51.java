package homework;

import CustomClassesForHomework.Employee;

import java.util.Scanner;

public class homework_51 {

    /*
    Write Employee Class where it has Int "Employee Id",
    String "Employee Name" and double "Employee Salary"
Write a code where It ask user to enter Employee ID,
Employee Name and Employee Salary where anytime user creates a new object of Employee Class.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your name");
        String Name = scan.nextLine();
        System.out.println("Please Enter your Employee ID");
        int ID = scan.nextInt();
        System.out.println("Please Enter your Salary");
        double Salary = scan.nextDouble();

        Employee MyEmployee = new Employee(Name,ID,Salary);

        System.out.print("Employee Name: "+MyEmployee.EmployeeName);
        System.out.print(" Employee ID: "+MyEmployee.GetID());
        System.out.print(" Employee Salary: "+MyEmployee.GetSalary()+"$");
    }
}
