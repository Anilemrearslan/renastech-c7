package Day27_ClassesAndInheritance;

import CustomClasses.AddressClass;
import CustomClasses.EmployeeClass;

public class Topic1_ClassesRecap {

    public static void main(String[] args) {

        AddressClass MyHomeAddress = new AddressClass();

        MyHomeAddress.StreetName="King Street";
        MyHomeAddress.StreetNumber= "102";
        MyHomeAddress.UnitNumber= "2/C";
        MyHomeAddress.PostalCode= "N3G 0A1";

        System.out.println(MyHomeAddress.GetFullAddress());

        EmployeeClass MyEmployee = new EmployeeClass();
        MyEmployee.Name = "Eric";
        MyEmployee.MyHomeAddress = new AddressClass();
        MyEmployee.MyHomeAddress.StreetNumber="5";
        MyEmployee.MyHomeAddress.StreetName="Queen Street";


        EmployeeClass AnotherEmployee = new EmployeeClass();
        AnotherEmployee.Name="Mehmet";
        AnotherEmployee.MyHomeAddress = new AddressClass();


    }
}
