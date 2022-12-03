package day32_Maps;

import java.util.ArrayList;

public class Topic1_IntroMaps {
    public static void main(String[] args) {
        ArrayList<String> MyEmployeeInformation = new ArrayList<>();

        MyEmployeeInformation.add("Eloise");
        MyEmployeeInformation.add("Elemen");
        MyEmployeeInformation.add("34");
        MyEmployeeInformation.add("1234567890");

        System.out.println(MyEmployeeInformation.get(0));
        PrintEmployee(MyEmployeeInformation);

    }

    /// please create a method that takes an ArrayList of String as parameter
    /// no return type
    /// Method Name = PrintEmployee
    ///This Method will print employee'sname and Age

    public static void PrintEmployee(ArrayList<String> param1){

        System.out.println(param1.get(0));
        System.out.println(param1.get(2));
    }
}
