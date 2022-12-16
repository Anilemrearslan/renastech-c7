package CustomClassesForHomework;

public class Employee {

    //fields
    private int EmployeeID;

    public String EmployeeName;

    private double EmployeeSalary;

    //constructor

    public Employee(String name, int ID , double Salary){
        EmployeeName = name;
        EmployeeID = ID;
        EmployeeSalary = Salary;
    }

//    getters

    public int GetID(){
        return EmployeeID;
    }
    public double GetSalary(){
        return EmployeeSalary;
    }
}
