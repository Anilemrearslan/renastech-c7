package homework;

import CustomClassesForHomework.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class homework_52 {
    /*
    Use Employee Class on the Homework 51 and write code where
It creates Employee Objects unless User choose to stop creating employee objects
and add all the created Employee object to ArrayList.
- Write a Method where it takes ArrayList of Employee and returns to shorted ArrayList of Employee
  based on the Salary.(Increasing order, Lowest first and so on)
- Write a method where It takes arrayList of Employee and Returns to ArrayList of String where
  it contains the Name of Employees
- Write a Method where it takes arrayList of Employee and return to the ArrayList of employee
  that has even Number Employee ID

- Write a Method Where it takes ArrayList of Employee where it returns an integer which is the
  count of employees who has Salary of 50k or more.
- Write a Method Where it takes ArrayList of Employee and Returns a double which is Total of Salaries in the List
- Write a Method Where it takes ArrayList of Employee, Calculates an Annual Bonus for Employee and Prints
  the Employee Name and the Amount of Bonus they will be receiving ( Bonus = 15% of salary)
- Write a Method where it Takes ArrayList of Employee and 2 integer values where they represent the index,
  and Swap the employees on the given index and print the index of swapped employees and their names.
     */

    public static void main(String[] args) {

        ArrayList<Employee> employeeList = new ArrayList<>();

        boolean condition = true;

        while(condition){
            Scanner scan = new Scanner(System.in);
            System.out.println("Please Enter your name");
            String Name = scan.nextLine();
            System.out.println("Please Enter your Employee ID");
            int ID = scan.nextInt();
            System.out.println("Please Enter your Salary");
            double Salary = scan.nextDouble();
            Employee employee = new Employee(Name, ID, Salary);

            System.out.println("Would you like to continue or not");
            System.out.println("Please answer as yes or no: ");
            String  userCondition = scan.next().toLowerCase();

            employeeList.add(employee);

            if (userCondition.equals("no")){
                condition =false;
            }
        }
    }

//- Write a Method where it takes ArrayList of Employee and returns to shorted ArrayList of Employee
//    based on the Salary.(Increasing order, Lowest first and so on)
    public static ArrayList<Employee> SortSalaries(ArrayList<Employee> param1){

        Employee TempEmployee = param1.get(0);

        for (int i = 0; i < param1.size(); i++) {

            for (int k = 1; k < param1.size(); k++) {

                if (param1.get(i).GetSalary() > param1.get(k).GetSalary()){
                    TempEmployee = param1.get(i);
                    param1.set(i,param1.get(k));
                    param1.set(k,TempEmployee);
                }

            }

        }

        return param1;
    }

//    - Write a method where It takes arrayList of Employee and Returns to ArrayList of String where
//    it contains the Name of Employees
    public static ArrayList<String> NameofEmployees(ArrayList<Employee>param1){

        ArrayList<String> EmployeeNames = new ArrayList<>();
        for(Employee ENames:param1){
            EmployeeNames.add(ENames.EmployeeName);
        }
        return EmployeeNames;
    }

//    - Write a Method where it takes arrayList of Employee and return to the ArrayList of employee
//    that has even Number Employee ID

    public static ArrayList<Employee> EvenID(ArrayList<Employee> param1){
        ArrayList<Employee> EmployeeIDWithEvenNumbers = new ArrayList<>();
        for(Employee employee:param1){
            if (employee.GetID() % 2 == 0){
                EmployeeIDWithEvenNumbers.add(employee);
            }
        }
        return EmployeeIDWithEvenNumbers;
    }
}
