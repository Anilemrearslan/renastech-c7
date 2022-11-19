package Day26_ClassesAndConstructors;

import CustomClasses.CarClass;
import CustomClasses.EmployeeClass;

public class Topic1_PublicClasses {

    public static void main(String[] args) {
        // how to define an Object
        // DataType VariableName = new constructor

        CarClass MyElectricCars = new CarClass();
        MyElectricCars.Make="Tesla";
        MyElectricCars.Model="3";
        MyElectricCars.Color="White";
        MyElectricCars.ModelYear=2021;


        EmployeeClass MyEmployee = new EmployeeClass();
         MyEmployee.Name = "Hayri";
         MyEmployee.SurName = "Aslan";
         MyEmployee.Department = "R&D";

         MyEmployee.SetEmployeeSIN("123 456 789");

        System.out.println(MyEmployee.GetEmployeeSIN());

    }
}
