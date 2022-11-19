package CustomClasses;

public class EmployeeClass {
    //Fields
    public String Name;
    public String SurName;
    public String Department;

    private String SIN;



    //Constructor
    public EmployeeClass(){
        System.out.println("You created an employee");
    }

    /// this is a constructor
    ///@param1 is a String variable that we will use as Name
    ///@param2 is a String variable that we will use as SurName
    ///@param3 is a String variable that we will use as Department
    public EmployeeClass(String param1, String param2, String param3){
        System.out.println("you created an employee with 3 parameters ");
        Name = param1;
        SurName = param2;
        Department = param3;
    }



    //Methods


    /// SetEmployeeSIN : This method wll set Employee's SIN number. Return type = void
    ///@param1 : thios is a String type parameter

    public void SetEmployeeSIN (String param1){
        SIN = param1;
    }

    ///GetEmployeeSIN: this method will return a String type and will return SIN value
    /// I don't have any parameters.
    public String GetEmployeeSIN(){
        return SIN;
    }




}
